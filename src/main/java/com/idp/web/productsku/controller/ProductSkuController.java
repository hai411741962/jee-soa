package com.idp.web.productsku.controller;
import com.idp.web.productsku.entity.ProductSku;
import com.idp.web.productsku.service.ProductSkuService;
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
 * 产品SKUcontroller
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-16 10:47 yhg
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
@RequestMapping("/productSku")
public class ProductSkuController extends BaseController {

	private Logger logger = Logger.getLogger(ProductSkuController.class);

	@Resource
	private ProductSkuService productSkuService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	鍒濆鍖栨煡璇㈤〉闈�
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "productsku/productSkuSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param productSku
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ProductSku productSku,Page<ProductSku> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", productSkuService.findByPage(productSku, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "productsku/productSkuList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	鏂板淇敼椤甸潰鍒濆鍖�
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/productSku")
	public String productSku(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ProductSku productSku = productSkuService.getById(id);
				request.setAttribute("productSku", productSku);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "productsku/productSku";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	淇濆瓨
	 * </pre>
	 * 
	 * @param productSku
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ProductSku productSku){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 淇敼
			if(ValidateUtils.isNotEmpty(productSku.getId())){
				
				productSkuService.update(productSku);
			}
			// 鏂板
			else{
				
				productSkuService.add(productSku);
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
	 * 	2016-09-16 10:47 yhg
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
			
			productSkuService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
