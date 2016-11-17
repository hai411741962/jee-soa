package com.idp.web.zcsupplier.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.zcsupplier.dao.ZcSupplierDao;
import com.idp.web.zcsupplier.entity.ZcSupplier;
import com.idp.web.zcsupplier.service.ZcSupplierService;

/**
 * 
 * 供应商管理service实现类
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
@Service("zcSupplierService")
public class ZcSupplierServiceImpl implements ZcSupplierService {

	@Resource
	private ZcSupplierDao zcSupplierDao;
	
	@Override
	public Page<ZcSupplier> findByPage(ZcSupplier zcSupplier, Page<ZcSupplier> page) {

		page.setResult(zcSupplierDao.find(zcSupplier, page));
		
		return page;
	}
	
	@Override
	public List<ZcSupplier> findBySearch(ZcSupplier zcSupplier) {

		return zcSupplierDao.find(zcSupplier);
	}
	
	@Override
	public ZcSupplier getById(Integer id) {

		return zcSupplierDao.getById(id);
	}

	@Override
	public void add(ZcSupplier zcSupplier) {

		zcSupplierDao.add(zcSupplier);
	}
	
	@Override
	public void update(ZcSupplier zcSupplier) {

		zcSupplierDao.update(zcSupplier);
	}

	@Override
	public void delete(Integer id) {

		zcSupplierDao.delete(id);
	}
 	
}