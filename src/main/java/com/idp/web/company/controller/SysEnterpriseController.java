package com.idp.web.company.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.company.entity.SysEnterprise;
import com.idp.web.company.service.SysEnterpriseService;

import net.sf.json.JSONObject;

/**
 * 
 * 公司管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-17 10:46 yhg
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
@RequestMapping("/sysEnterprise")
public class SysEnterpriseController extends BaseController {

	private Logger logger = Logger.getLogger(SysEnterpriseController.class);

	@Resource
	private SysEnterpriseService sysEnterpriseService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "company/sysEnterpriseSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param sysEnterprise
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(SysEnterprise sysEnterprise,Page<SysEnterprise> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", sysEnterpriseService.findByPage(sysEnterprise, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "company/sysEnterpriseList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/sysEnterprise")
	public String sysEnterprise(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				SysEnterprise sysEnterprise = sysEnterpriseService.getById(id);
				request.setAttribute("sysEnterprise", sysEnterprise);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "company/sysEnterprise";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param sysEnterprise
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(SysEnterprise sysEnterprise){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(sysEnterprise.getId())){
				
				sysEnterpriseService.update(sysEnterprise);
			}
			// 新增
			else{
				
				sysEnterpriseService.add(sysEnterprise);
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
	 * 	2016-08-17 10:46 yhg
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
			
			sysEnterpriseService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
