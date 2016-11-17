package com.idp.web.zcsupplier.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.zcsupplier.entity.ZcSupplier;

/**
 * 
 * 供应商管理service接口
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-06 13:21 yhg
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
public interface ZcSupplierService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param zcSupplier
	 * @param page
	 * @return
	 */
	public Page<ZcSupplier> findByPage(ZcSupplier zcSupplier,Page<ZcSupplier> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param zcSupplier
	 * @return
	 */
	public List<ZcSupplier> findBySearch(ZcSupplier zcSupplier);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param ZcSupplier
	 * @return
	 */
	public ZcSupplier getById(Integer id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param zcSupplier
	 */
	public void add(ZcSupplier zcSupplier);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param zcSupplier
	 */
	public void update(ZcSupplier zcSupplier);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 13:21 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
