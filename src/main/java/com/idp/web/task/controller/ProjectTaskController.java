package com.idp.web.task.controller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.model.ExportExcel;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.task.entity.ProjectTask;
import com.idp.web.task.entity.ProjectTaskFrom;
import com.idp.web.task.service.ProjectTaskService;

import net.sf.json.JSONObject;

/**
 * 
 * 任务管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-18 11:13 yhg
 * 	新建文件
 * </pre>
 * 
 * @author 
 * <pre>
 * SD
 * 	yhg
 * PG
 *	yhg
 * UT
 *
 * MA
 * </pre>
 * @version $Rev$
 *
 * <p/> $Id$
 *
 */
@Controller
@RequestMapping("/projectTask")
public class ProjectTaskController extends BaseController {

	private Logger logger = Logger.getLogger(ProjectTaskController.class);

	@Resource
	private ProjectTaskService projectTaskService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "task/projectTaskSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param projectTask
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ProjectTask projectTask,Page<ProjectTask> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", projectTaskService.findByPage(projectTask, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "task/projectTaskList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/projectTask")
	public String projectTask(Integer id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ProjectTask projectTask = projectTaskService.getById(id);
				request.setAttribute("projectTask", projectTask);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "task/projectTask";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param projectTask
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ProjectTask projectTask){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(projectTask.getId())){
				
				projectTaskService.update(projectTask);
			}
			// 新增
			else{
				
				projectTaskService.add(projectTask);
			}
			json.put("result", "save_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "save_fail");
		}
		
		return json.toString();
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Integer id){
		
		JSONObject json = new JSONObject();
		
		try {
			
			projectTaskService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
	/**
	 * 导出任务excel
	 * @param request
	 * @return
	 */
	@RequestMapping("/exportExcel")
	@ResponseBody
	public void exportExcel(ProjectTask projectTask,HttpServletRequest request){
		
		ExportExcel<ProjectTaskFrom> ex =new ExportExcel<ProjectTaskFrom>();
		String[] headers = {"所属模块", "任务名称", "开始时间", "结束时间", "实际开始时间","实际开始时间","负责人名称","任务描述","任务完成状态"};
		List<ProjectTask> projectTasks = projectTaskService.findBySearch(projectTask);
		
		List<ProjectTaskFrom> projectTaskFroms = new ArrayList<>();
		
		for (ProjectTask pro : projectTasks) {
			
			ProjectTaskFrom p2 = new ProjectTaskFrom();
			p2.setProjectName(pro.getProjectName());
			p2.setName(pro.getName());
			p2.setStartTime(pro.getStartTime());
			p2.setEndTime(pro.getEndTime());
			p2.setFactStartTime(pro.getFactStartTime());
			p2.setFactEndTime(pro.getFactEndTime());
			p2.setPresideName(pro.getPresideName());
			p2.setRemark(pro.getRemark());
			p2.setStatus(pro.getStatus());
			projectTaskFroms.add(p2);
		}
		
		
		try {
			 OutputStream out = new FileOutputStream("E://项目任务计划.xls");
			 ex.exportExcel(headers, projectTaskFroms, out);
			 out.close();
			System.out.println("======excel导出成功！=======");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
		}
	
	}
	
	
	
	
}
