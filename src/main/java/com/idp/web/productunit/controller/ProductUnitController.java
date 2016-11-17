package com.idp.web.productunit.controller;
import com.idp.web.productunit.entity.ProductUnit;
import com.idp.web.productunit.service.ProductUnitService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;

import net.sf.json.JSONObject;

/**
 * 
 * 单位管理controller
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-13 11:10 yhg
 * 	鏂板缓鏂囦欢
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
@RequestMapping("/productUnit")
public class ProductUnitController extends BaseController {

	private Logger logger = Logger.getLogger(ProductUnitController.class);

	@Resource
	private ProductUnitService productUnitService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	鍒濆鍖栨煡璇㈤〉闈�
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "productunit/productUnitSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param productUnit
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ProductUnit productUnit,Page<ProductUnit> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", productUnitService.findByPage(productUnit, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "productunit/productUnitList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	鏂板淇敼椤甸潰鍒濆鍖�
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/productUnit")
	public String productUnit(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ProductUnit productUnit = productUnitService.getById(id);
				request.setAttribute("productUnit", productUnit);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "productunit/productUnit";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	淇濆瓨
	 * </pre>
	 * 
	 * @param productUnit
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ProductUnit productUnit){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 淇敼
			if(ValidateUtils.isNotEmpty(productUnit.getId())){
				
				productUnitService.update(productUnit);
			}
			// 鏂板
			else{
				
				productUnitService.add(productUnit);
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
	 * 	2016-09-13 11:10 yhg
	 * 	鍒犻櫎
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
			
			productUnitService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
