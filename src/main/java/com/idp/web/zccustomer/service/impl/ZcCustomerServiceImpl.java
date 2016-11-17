package com.idp.web.zccustomer.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.zccustomer.dao.ZcCustomerDao;
import com.idp.web.zccustomer.entity.ZcCustomer;
import com.idp.web.zccustomer.service.ZcCustomerService;

/**
 * 
 * 客户管理service实现类
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
@Service("zcCustomerService")
public class ZcCustomerServiceImpl implements ZcCustomerService {

	@Resource
	private ZcCustomerDao zcCustomerDao;
	
	@Override
	public Page<ZcCustomer> findByPage(ZcCustomer zcCustomer, Page<ZcCustomer> page) {

		page.setResult(zcCustomerDao.find(zcCustomer, page));
		
		return page;
	}
	
	@Override
	public List<ZcCustomer> findBySearch(ZcCustomer zcCustomer) {

		return zcCustomerDao.find(zcCustomer);
	}
	
	@Override
	public ZcCustomer getById(Integer id) {

		return zcCustomerDao.getById(id);
	}

	@Override
	public void add(ZcCustomer zcCustomer) {

		zcCustomerDao.add(zcCustomer);
	}
	
	@Override
	public void update(ZcCustomer zcCustomer) {

		zcCustomerDao.update(zcCustomer);
	}

	@Override
	public void delete(Integer id) {

		zcCustomerDao.delete(id);
	}
 	
}