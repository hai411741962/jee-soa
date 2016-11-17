package com.idp.web.productsku.service.impl;
import com.idp.web.productsku.service.ProductSkuService;
import com.idp.web.productsku.dao.ProductSkuDao;
import com.idp.web.productsku.entity.ProductSku;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;

/**
 * 
 * 产品SKUservice瀹炵幇绫�
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-16 10:47 yhg
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
@Service("productSkuService")
public class ProductSkuServiceImpl implements ProductSkuService {

	@Resource
	private ProductSkuDao productSkuDao;
	
	@Override
	public Page<ProductSku> findByPage(ProductSku productSku, Page<ProductSku> page) {

		page.setResult(productSkuDao.find(productSku, page));
		
		return page;
	}
	
	@Override
	public List<ProductSku> findBySearch(ProductSku productSku) {

		return productSkuDao.find(productSku);
	}
	
	@Override
	public ProductSku getById(Long id) {

		return productSkuDao.getById(id);
	}

	@Override
	public void add(ProductSku productSku) {

		productSkuDao.add(productSku);
	}
	
	@Override
	public void update(ProductSku productSku) {

		productSkuDao.update(productSku);
	}

	@Override
	public void delete(Long id) {

		productSkuDao.delete(id);
	}
 	
}