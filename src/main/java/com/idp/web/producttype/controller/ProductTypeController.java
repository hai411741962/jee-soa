package com.idp.web.producttype.controller;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.producttype.entity.ProductType;
import com.idp.web.producttype.service.ProductTypeService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 
 * 产品类型管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-07 14:44 yhg
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
@RequestMapping("/productType")
public class ProductTypeController extends BaseController {

	private Logger logger = Logger.getLogger(ProductTypeController.class);

	@Resource
	private ProductTypeService productTypeService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "producttype/productTypeSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param productType
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ProductType productType,Page<ProductType> page,HttpServletRequest request){
		
		try {
			
			//request.setAttribute("page", productTypeService.findByPage(productType, page));
			
			request.setAttribute("productTypeList", productTypeService.findForTreeTable(0L));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "producttype/productTypeList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/productType")
	public String productType(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ProductType productType = productTypeService.getById(id);
				request.setAttribute("productType", productType);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "producttype/productType";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param productType
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ProductType productType){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(productType.getId())){
				
				productTypeService.update(productType);
			}
			// 新增
			else{
				ProductType pType = new ProductType();
				pType.setCreateData(new Date());
				pType.setCompanyId(productType.getCompanyId());
				pType.setParentId(productType.getParentId());
				pType.setProtypeIcon(productType.getProtypeIcon());
				pType.setProtypeName(productType.getProtypeName());
				pType.setDelStatus(0);
				pType.setSort(productType.getSort());
				productTypeService.add(pType);
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
	 * 	2016-09-07 14:44 yhg
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
			
			productTypeService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
	
	
	/**
	 * 查询下级菜单
	 * @param parentId
	 * @return
	 */
	@RequestMapping("/treeTable")
	@ResponseBody
	public String treeTable(Long parentId){
		JSONArray json = new JSONArray();
		
		try {
			
			json.addAll(productTypeService.findForTreeTable(parentId));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		
		return json.toString();
	}
	
	
	/**
	 * 获取菜单树状结构
	 * @return
	 */
	@RequestMapping("/getProTypeForTree")
	@ResponseBody
	public String getProTypeForTree(Long currentId){
		JSONArray json = new JSONArray();
		
		List<ProductType> productTypeList= productTypeService.find(new ProductType());
		
		if(productTypeList != null && productTypeList.size() > 0){
			for(ProductType productType : productTypeList){
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("id", productType.getId());
				map.put("name", productType.getProtypeName());
				map.put("pId", productType.getParentId());
				json.add(map);
			}
		}
		
		return json.toString();
	}
	
	
	
	
}
