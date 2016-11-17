package com.idp.web.productunit.service;
import com.idp.web.productunit.entity.ProductUnit;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 单位管理service鎺ュ彛
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
public interface ProductUnitService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param productUnit
	 * @param page
	 * @return
	 */
	public Page<ProductUnit> findByPage(ProductUnit productUnit,Page<ProductUnit> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	鏌ヨ
	 * </pre>
	 * 
	 * @param productUnit
	 * @return
	 */
	public List<ProductUnit> findBySearch(ProductUnit productUnit);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	閫氳繃ID鏌ヨ
	 * </pre>
	 * 
	 * @param ProductUnit
	 * @return
	 */
	public ProductUnit getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	鏂板
	 * </pre>
	 * 
	 * @param productUnit
	 */
	public void add(ProductUnit productUnit);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	淇敼
	 * </pre>
	 * 
	 * @param productUnit
	 */
	public void update(ProductUnit productUnit);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-13 11:10 yhg
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
