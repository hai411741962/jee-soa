package com.idp.web.zcpurchaseorder.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.zcpurchaseorder.entity.ZcPurchaseOrder;

/**
 * 
 * 采购单管理service接口
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
public interface ZcPurchaseOrderService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param zcPurchaseOrder
	 * @param page
	 * @return
	 */
	public Page<ZcPurchaseOrder> findByPage(ZcPurchaseOrder zcPurchaseOrder,Page<ZcPurchaseOrder> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param zcPurchaseOrder
	 * @return
	 */
	public List<ZcPurchaseOrder> findBySearch(ZcPurchaseOrder zcPurchaseOrder);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param ZcPurchaseOrder
	 * @return
	 */
	public ZcPurchaseOrder getById(Integer id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param zcPurchaseOrder
	 */
	public void add(ZcPurchaseOrder zcPurchaseOrder);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param zcPurchaseOrder
	 */
	public void update(ZcPurchaseOrder zcPurchaseOrder);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 15:11 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
