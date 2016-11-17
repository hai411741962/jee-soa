package com.idp.web.zccustomer.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.zccustomer.entity.ZcCustomer;
import com.idp.web.zccustomer.service.ZcCustomerService;

import net.sf.json.JSONObject;

/**
 * 
 * 客户管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-06 12:48 yhg
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
@RequestMapping("/zcCustomer")
public class ZcCustomerController extends BaseController {

	private Logger logger = Logger.getLogger(ZcCustomerController.class);

	@Resource
	private ZcCustomerService zcCustomerService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "zccustomer/zcCustomerSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param zcCustomer
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ZcCustomer zcCustomer,Page<ZcCustomer> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", zcCustomerService.findByPage(zcCustomer, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "zccustomer/zcCustomerList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/zcCustomer")
	public String zcCustomer(Integer id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ZcCustomer zcCustomer = zcCustomerService.getById(id);
				request.setAttribute("zcCustomer", zcCustomer);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "zccustomer/zcCustomer";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param zcCustomer
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ZcCustomer zcCustomer){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(zcCustomer.getId())){
				
				zcCustomerService.update(zcCustomer);
			}
			// 新增
			else{
				
				zcCustomerService.add(zcCustomer);
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
	 * 	2016-09-06 12:48 yhg
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
			
			zcCustomerService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
