package com.idp.web.zcsupplier.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.zcsupplier.entity.ZcSupplier;
import com.idp.web.zcsupplier.service.ZcSupplierService;

import net.sf.json.JSONObject;

/**
 * 
 * 供应商管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-06 13:21 yhg
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
@RequestMapping("/zcSupplier")
public class ZcSupplierController extends BaseController {

	private Logger logger = Logger.getLogger(ZcSupplierController.class);

	@Resource
	private ZcSupplierService zcSupplierService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "zcsupplier/zcSupplierSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param zcSupplier
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ZcSupplier zcSupplier,Page<ZcSupplier> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", zcSupplierService.findByPage(zcSupplier, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "zcsupplier/zcSupplierList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/zcSupplier")
	public String zcSupplier(Integer id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ZcSupplier zcSupplier = zcSupplierService.getById(id);
				request.setAttribute("zcSupplier", zcSupplier);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "zcsupplier/zcSupplier";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param zcSupplier
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ZcSupplier zcSupplier){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(zcSupplier.getId())){
				
				zcSupplierService.update(zcSupplier);
			}
			// 新增
			else{
				
				zcSupplierService.add(zcSupplier);
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
	 * 	2016-09-06 13:21 yhg
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
			
			zcSupplierService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
