package com.idp.web.product.controller;
import java.util.Date;

import com.idp.web.product.entity.Product;
import com.idp.web.product.service.ProductService;

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
 * 产品管理controller
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-14 21:57 yhg
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
@RequestMapping("/product")
public class ProductController extends BaseController {

	private Logger logger = Logger.getLogger(ProductController.class);

	@Resource
	private ProductService productService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	鍒濆鍖栨煡璇㈤〉闈�
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "product/productSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param product
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Product product,Page<Product> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", productService.findByPage(product, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "product/productList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	鏂板淇敼椤甸潰鍒濆鍖�
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/product")
	public String product(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				Product product = productService.getById(id);
				request.setAttribute("product", product);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "product/product";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	淇濆瓨
	 * </pre>
	 * 
	 * @param product
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(Product product){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 淇敼
			if(ValidateUtils.isNotEmpty(product.getId())){
				
				productService.update(product);
			}
			// 鏂板
			else{
				product.setDelFlag("N");
				product.setCreateDate(new Date());
				productService.add(product);
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
	 * 	2016-09-14 21:57 yhg
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
			
			productService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
