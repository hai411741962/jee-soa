package com.idp.web.employee.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.employee.entity.Employee;

/**
 * 
 * 员工管理service接口
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-18 10:03 yhg
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
public interface EmployeeService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param employee
	 * @param page
	 * @return
	 */
	public Page<Employee> findByPage(Employee employee,Page<Employee> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param employee
	 * @return
	 */
	public List<Employee> findBySearch(Employee employee);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param Employee
	 * @return
	 */
	public Employee getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param employee
	 */
	public void add(Employee employee);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param employee
	 */
	public void update(Employee employee);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 10:03 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
