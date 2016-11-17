package com.idp.web.productsku.service;
import com.idp.web.productsku.entity.ProductSku;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 产品SKUservice鎺ュ彛
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
public interface ProductSkuService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param productSku
	 * @param page
	 * @return
	 */
	public Page<ProductSku> findByPage(ProductSku productSku,Page<ProductSku> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	鏌ヨ
	 * </pre>
	 * 
	 * @param productSku
	 * @return
	 */
	public List<ProductSku> findBySearch(ProductSku productSku);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	閫氳繃ID鏌ヨ
	 * </pre>
	 * 
	 * @param ProductSku
	 * @return
	 */
	public ProductSku getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	鏂板
	 * </pre>
	 * 
	 * @param productSku
	 */
	public void add(ProductSku productSku);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	淇敼
	 * </pre>
	 * 
	 * @param productSku
	 */
	public void update(ProductSku productSku);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-16 10:47 yhg
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
