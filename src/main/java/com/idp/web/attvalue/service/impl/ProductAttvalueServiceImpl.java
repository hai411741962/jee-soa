package com.idp.web.attvalue.service.impl;
import com.idp.web.attvalue.service.ProductAttvalueService;
import com.idp.web.attvalue.dao.ProductAttvalueDao;
import com.idp.web.attvalue.entity.ProductAttvalue;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;

/**
 * 
 * 属性值管理service瀹炵幇绫�
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-11 20:44 yhg
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
@Service("productAttvalueService")
public class ProductAttvalueServiceImpl implements ProductAttvalueService {

	@Resource
	private ProductAttvalueDao productAttvalueDao;
	
	@Override
	public Page<ProductAttvalue> findByPage(ProductAttvalue productAttvalue, Page<ProductAttvalue> page) {

		page.setResult(productAttvalueDao.find(productAttvalue, page));
		
		return page;
	}
	
	@Override
	public List<ProductAttvalue> findBySearch(ProductAttvalue productAttvalue) {

		return productAttvalueDao.find(productAttvalue);
	}
	
	@Override
	public ProductAttvalue getById(Long id) {

		return productAttvalueDao.getById(id);
	}

	@Override
	public void add(ProductAttvalue productAttvalue) {

		productAttvalueDao.add(productAttvalue);
	}
	
	@Override
	public void update(ProductAttvalue productAttvalue) {

		productAttvalueDao.update(productAttvalue);
	}

	@Override
	public void delete(Long id) {

		productAttvalueDao.delete(id);
	}
 	
}