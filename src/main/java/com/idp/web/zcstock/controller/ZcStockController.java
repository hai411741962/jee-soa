package com.idp.web.zcstock.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.zcstock.entity.ZcStock;
import com.idp.web.zcstock.service.ZcStockService;

import net.sf.json.JSONObject;

/**
 * 
 * 存货管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-22 13:37 yhg
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
@RequestMapping("/zcStock")
public class ZcStockController extends BaseController {

	private Logger logger = Logger.getLogger(ZcStockController.class);

	@Resource
	private ZcStockService zcStockService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "zcstock/zcStockSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param zcStock
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ZcStock zcStock,Page<ZcStock> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", zcStockService.findByPage(zcStock, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "zcstock/zcStockList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/zcStock")
	public String zcStock(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ZcStock zcStock = zcStockService.getById(id);
				request.setAttribute("zcStock", zcStock);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "zcstock/zcStock";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param zcStock
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ZcStock zcStock){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(zcStock.getId())){
				
				zcStockService.update(zcStock);
			}
			// 新增
			else{
				
				zcStockService.add(zcStock);
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
	 * 	2016-08-22 13:37 yhg
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
			
			zcStockService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
