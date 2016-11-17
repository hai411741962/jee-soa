package com.idp.web.zcpurchaseorder.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.zcpurchaseorder.entity.ZcPurchaseOrder;
import com.idp.web.zcpurchaseorder.service.ZcPurchaseOrderService;

import net.sf.json.JSONObject;

/**
 * 
 * 采购单管理controller
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-06 15:11 yhg
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
@RequestMapping("/zcPurchaseOrder")
public class ZcPurchaseOrderController extends BaseController {

	private Logger logger = Logger.getLogger(ZcPurchaseOrderController.class);

	@Resource
	private ZcPurchaseOrderService zcPurchaseOrderService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "zcpurchaseorder/zcPurchaseOrderSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param zcPurchaseOrder
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ZcPurchaseOrder zcPurchaseOrder,Page<ZcPurchaseOrder> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", zcPurchaseOrderService.findByPage(zcPurchaseOrder, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "zcpurchaseorder/zcPurchaseOrderList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/zcPurchaseOrder")
	public String zcPurchaseOrder(Integer id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ZcPurchaseOrder zcPurchaseOrder = zcPurchaseOrderService.getById(id);
				request.setAttribute("zcPurchaseOrder", zcPurchaseOrder);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "zcpurchaseorder/zcPurchaseOrder";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param zcPurchaseOrder
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ZcPurchaseOrder zcPurchaseOrder){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(zcPurchaseOrder.getId())){
				
				zcPurchaseOrderService.update(zcPurchaseOrder);
			}
			// 新增
			else{
				
				zcPurchaseOrderService.add(zcPurchaseOrder);
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
	 * 	2016-09-06 15:11 yhg
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
			
			zcPurchaseOrderService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
