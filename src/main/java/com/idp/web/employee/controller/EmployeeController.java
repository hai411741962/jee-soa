package com.idp.web.employee.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.employee.entity.Employee;
import com.idp.web.employee.service.EmployeeService;

import net.sf.json.JSONObject;

/**
 * 
 * 员工管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-18 10:03 yhg
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
@RequestMapping("/employee")
public class EmployeeController extends BaseController {

	private Logger logger = Logger.getLogger(EmployeeController.class);

	@Resource
	private EmployeeService employeeService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "employee/employeeSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param employee
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Employee employee,Page<Employee> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", employeeService.findByPage(employee, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "employee/employeeList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/employee")
	public String employee(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				Employee employee = employeeService.getById(id);
				request.setAttribute("employee", employee);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "employee/employee";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param employee
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(Employee employee){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(employee.getId())){
				
				employeeService.update(employee);
			}
			// 新增
			else{
				
				employeeService.add(employee);
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
	 * 	2016-08-18 10:03 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id){
		
		JSONObject json = new JSONObject();
		
		try {
			
			employeeService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
