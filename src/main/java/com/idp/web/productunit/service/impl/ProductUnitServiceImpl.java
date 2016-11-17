package com.idp.web.productunit.service.impl;
import com.idp.web.productunit.service.ProductUnitService;
import com.idp.web.productunit.dao.ProductUnitDao;
import com.idp.web.productunit.entity.ProductUnit;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;

/**
 * 
 * 单位管理service瀹炵幇绫�
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
@Service("productUnitService")
public class ProductUnitServiceImpl implements ProductUnitService {

	@Resource
	private ProductUnitDao productUnitDao;
	
	@Override
	public Page<ProductUnit> findByPage(ProductUnit productUnit, Page<ProductUnit> page) {

		page.setResult(productUnitDao.find(productUnit, page));
		
		return page;
	}
	
	@Override
	public List<ProductUnit> findBySearch(ProductUnit productUnit) {

		return productUnitDao.find(productUnit);
	}
	
	@Override
	public ProductUnit getById(Long id) {

		return productUnitDao.getById(id);
	}

	@Override
	public void add(ProductUnit productUnit) {

		productUnitDao.add(productUnit);
	}
	
	@Override
	public void update(ProductUnit productUnit) {

		productUnitDao.update(productUnit);
	}

	@Override
	public void delete(Long id) {

		productUnitDao.delete(id);
	}
 	
}