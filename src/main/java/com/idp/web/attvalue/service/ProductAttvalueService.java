package com.idp.web.attvalue.service;
import com.idp.web.attvalue.entity.ProductAttvalue;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 属性值管理service鎺ュ彛
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
public interface ProductAttvalueService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param productAttvalue
	 * @param page
	 * @return
	 */
	public Page<ProductAttvalue> findByPage(ProductAttvalue productAttvalue,Page<ProductAttvalue> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	鏌ヨ
	 * </pre>
	 * 
	 * @param productAttvalue
	 * @return
	 */
	public List<ProductAttvalue> findBySearch(ProductAttvalue productAttvalue);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	閫氳繃ID鏌ヨ
	 * </pre>
	 * 
	 * @param ProductAttvalue
	 * @return
	 */
	public ProductAttvalue getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	鏂板
	 * </pre>
	 * 
	 * @param productAttvalue
	 */
	public void add(ProductAttvalue productAttvalue);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	淇敼
	 * </pre>
	 * 
	 * @param productAttvalue
	 */
	public void update(ProductAttvalue productAttvalue);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-11 20:44 yhg
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
