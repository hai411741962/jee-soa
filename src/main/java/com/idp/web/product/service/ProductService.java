package com.idp.web.product.service;
import com.idp.web.product.entity.Product;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 产品管理service鎺ュ彛
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
public interface ProductService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param product
	 * @param page
	 * @return
	 */
	public Page<Product> findByPage(Product product,Page<Product> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	鏌ヨ
	 * </pre>
	 * 
	 * @param product
	 * @return
	 */
	public List<Product> findBySearch(Product product);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	閫氳繃ID鏌ヨ
	 * </pre>
	 * 
	 * @param Product
	 * @return
	 */
	public Product getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	鏂板
	 * </pre>
	 * 
	 * @param product
	 */
	public void add(Product product);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	淇敼
	 * </pre>
	 * 
	 * @param product
	 */
	public void update(Product product);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-14 21:57 yhg
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
