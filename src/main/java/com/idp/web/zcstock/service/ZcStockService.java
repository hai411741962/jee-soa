package com.idp.web.zcstock.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.zcstock.entity.ZcStock;

/**
 * 
 * 存货管理service接口
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
public interface ZcStockService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param zcStock
	 * @param page
	 * @return
	 */
	public Page<ZcStock> findByPage(ZcStock zcStock,Page<ZcStock> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param zcStock
	 * @return
	 */
	public List<ZcStock> findBySearch(ZcStock zcStock);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param ZcStock
	 * @return
	 */
	public ZcStock getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param zcStock
	 */
	public void add(ZcStock zcStock);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param zcStock
	 */
	public void update(ZcStock zcStock);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-22 13:37 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
