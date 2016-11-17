package com.idp.web.attvalue.controller;
import com.idp.web.attvalue.entity.ProductAttvalue;
import com.idp.web.attvalue.service.ProductAttvalueService;
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
 * 属性值管理controller
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-11 20:44 yhg
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
@RequestMapping("/productAttvalue")
public class ProductAttvalueController extends BaseController {

	private Logger logger = Logger.getLogger(ProductAttvalueController.class);

	@Resource
	private ProductAttvalueService productAttvalueService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	鍒濆鍖栨煡璇㈤〉闈�
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "attvalue/productAttvalueSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param productAttvalue
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ProductAttvalue productAttvalue,Page<ProductAttvalue> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", productAttvalueService.findByPage(productAttvalue, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "attvalue/productAttvalueList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	鏂板淇敼椤甸潰鍒濆鍖�
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/productAttvalue")
	public String productAttvalue(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ProductAttvalue productAttvalue = productAttvalueService.getById(id);
				request.setAttribute("productAttvalue", productAttvalue);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "attvalue/productAttvalue";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	淇濆瓨
	 * </pre>
	 * 
	 * @param productAttvalue
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ProductAttvalue productAttvalue){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 淇敼
			if(ValidateUtils.isNotEmpty(productAttvalue.getId())){
				
				productAttvalueService.update(productAttvalue);
			}
			// 鏂板
			else{
				
				productAttvalueService.add(productAttvalue);
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
	 * 	2016-09-11 20:44 yhg
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
			
			productAttvalueService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
