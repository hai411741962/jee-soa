package com.idp.web.company.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.company.entity.SysEnterprise;

/**
 * 
 * 公司管理service接口
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-17 10:46 yhg
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
public interface SysEnterpriseService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param sysEnterprise
	 * @param page
	 * @return
	 */
	public Page<SysEnterprise> findByPage(SysEnterprise sysEnterprise,Page<SysEnterprise> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param sysEnterprise
	 * @return
	 */
	public List<SysEnterprise> findBySearch(SysEnterprise sysEnterprise);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param SysEnterprise
	 * @return
	 */
	public SysEnterprise getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param sysEnterprise
	 */
	public void add(SysEnterprise sysEnterprise);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param sysEnterprise
	 */
	public void update(SysEnterprise sysEnterprise);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-17 10:46 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
