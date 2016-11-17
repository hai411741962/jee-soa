package com.idp.web.producttype.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.producttype.dao.ProductTypeDao;
import com.idp.web.producttype.entity.ProductType;
import com.idp.web.producttype.service.ProductTypeService;

/**
 * 
 * 产品类型管理service实现类
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
@Service("productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {

	@Resource
	private ProductTypeDao productTypeDao;
	
	@Override
	public Page<ProductType> findByPage(ProductType productType, Page<ProductType> page) {

		page.setResult(productTypeDao.find(productType, page));
		
		return page;
	}
	
	@Override
	public List<ProductType> findBySearch(ProductType productType) {

		return productTypeDao.find(productType);
	}
	
	@Override
	public ProductType getById(Long id) {

		return productTypeDao.getById(id);
	}

	@Override
	public void add(ProductType productType) {

		productTypeDao.add(productType);
	}
	
	@Override
	public void update(ProductType productType) {

		productTypeDao.update(productType);
	}

	@Override
	public void delete(Long id) {

		productTypeDao.delete(id);
	}

	@Override
	public List<ProductType> findForTreeTable(Long parentId) {
		// TODO Auto-generated method stub
		return productTypeDao.findProductTypeTree(parentId);
	}

	@Override
	public List<ProductType> find(ProductType productType) {
		return productTypeDao.find(productType);
	}
 	
}