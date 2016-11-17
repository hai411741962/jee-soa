package com.idp.web.zcpurchaseorder.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.zcpurchaseorder.dao.ZcPurchaseOrderDao;
import com.idp.web.zcpurchaseorder.entity.ZcPurchaseOrder;
import com.idp.web.zcpurchaseorder.service.ZcPurchaseOrderService;

/**
 * 
 * 采购单管理service实现类
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
@Service("zcPurchaseOrderService")
public class ZcPurchaseOrderServiceImpl implements ZcPurchaseOrderService {

	@Resource
	private ZcPurchaseOrderDao zcPurchaseOrderDao;
	
	@Override
	public Page<ZcPurchaseOrder> findByPage(ZcPurchaseOrder zcPurchaseOrder, Page<ZcPurchaseOrder> page) {

		page.setResult(zcPurchaseOrderDao.find(zcPurchaseOrder, page));
		
		return page;
	}
	
	@Override
	public List<ZcPurchaseOrder> findBySearch(ZcPurchaseOrder zcPurchaseOrder) {

		return zcPurchaseOrderDao.find(zcPurchaseOrder);
	}
	
	@Override
	public ZcPurchaseOrder getById(Integer id) {

		return zcPurchaseOrderDao.getById(id);
	}

	@Override
	public void add(ZcPurchaseOrder zcPurchaseOrder) {

		zcPurchaseOrderDao.add(zcPurchaseOrder);
	}
	
	@Override
	public void update(ZcPurchaseOrder zcPurchaseOrder) {

		zcPurchaseOrderDao.update(zcPurchaseOrder);
	}

	@Override
	public void delete(Integer id) {

		zcPurchaseOrderDao.delete(id);
	}
 	
}