package com.idp.web.product.service.impl;
import com.idp.web.product.service.ProductService;
import com.idp.web.product.dao.ProductDao;
import com.idp.web.product.entity.Product;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;

/**
 * 
 * 产品管理service瀹炵幇绫�
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
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductDao productDao;
	
	@Override
	public Page<Product> findByPage(Product product, Page<Product> page) {

		page.setResult(productDao.find(product, page));
		
		return page;
	}
	
	@Override
	public List<Product> findBySearch(Product product) {

		return productDao.find(product);
	}
	
	@Override
	public Product getById(Long id) {

		return productDao.getById(id);
	}

	@Override
	public void add(Product product) {

		productDao.add(product);
	}
	
	@Override
	public void update(Product product) {

		productDao.update(product);
	}

	@Override
	public void delete(Long id) {

		productDao.delete(id);
	}
 	
}