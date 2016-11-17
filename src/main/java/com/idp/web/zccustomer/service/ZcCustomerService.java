package com.idp.web.zccustomer.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.zccustomer.entity.ZcCustomer;

/**
 * 
 * 客户管理service接口
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-06 12:48 yhg
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
public interface ZcCustomerService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param zcCustomer
	 * @param page
	 * @return
	 */
	public Page<ZcCustomer> findByPage(ZcCustomer zcCustomer,Page<ZcCustomer> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param zcCustomer
	 * @return
	 */
	public List<ZcCustomer> findBySearch(ZcCustomer zcCustomer);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param ZcCustomer
	 * @return
	 */
	public ZcCustomer getById(Integer id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param zcCustomer
	 */
	public void add(ZcCustomer zcCustomer);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param zcCustomer
	 */
	public void update(ZcCustomer zcCustomer);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-06 12:48 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Integer id);
}
