package com.idp.web.zcstock.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.zcstock.dao.ZcStockDao;
import com.idp.web.zcstock.entity.ZcStock;
import com.idp.web.zcstock.service.ZcStockService;

/**
 * 
 * 存货管理service实现类
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
@Service("zcStockService")
public class ZcStockServiceImpl implements ZcStockService {

	@Resource
	private ZcStockDao zcStockDao;
	
	@Override
	public Page<ZcStock> findByPage(ZcStock zcStock, Page<ZcStock> page) {

		page.setResult(zcStockDao.find(zcStock, page));
		
		return page;
	}
	
	@Override
	public List<ZcStock> findBySearch(ZcStock zcStock) {

		return zcStockDao.find(zcStock);
	}
	
	@Override
	public ZcStock getById(Long id) {

		return zcStockDao.getById(id);
	}

	@Override
	public void add(ZcStock zcStock) {

		zcStockDao.add(zcStock);
	}
	
	@Override
	public void update(ZcStock zcStock) {

		zcStockDao.update(zcStock);
	}

	@Override
	public void delete(Long id) {

		zcStockDao.delete(id);
	}
 	
}