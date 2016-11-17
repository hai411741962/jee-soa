package com.idp.web.employee.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.employee.dao.EmployeeDao;
import com.idp.web.employee.entity.Employee;
import com.idp.web.employee.service.EmployeeService;

/**
 * 
 * 员工管理service实现类
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
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	private EmployeeDao employeeDao;
	
	@Override
	public Page<Employee> findByPage(Employee employee, Page<Employee> page) {

		page.setResult(employeeDao.find(employee, page));
		
		return page;
	}
	
	@Override
	public List<Employee> findBySearch(Employee employee) {

		return employeeDao.find(employee);
	}
	
	@Override
	public Employee getById(Long id) {

		return employeeDao.getById(id);
	}

	@Override
	public void add(Employee employee) {

		employeeDao.add(employee);
	}
	
	@Override
	public void update(Employee employee) {

		employeeDao.update(employee);
	}

	@Override
	public void delete(Long id) {

		employeeDao.delete(id);
	}
 	
}