package com.idp.web.company.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.company.dao.SysEnterpriseDao;
import com.idp.web.company.entity.SysEnterprise;
import com.idp.web.company.service.SysEnterpriseService;

/**
 * 
 * 公司管理service实现类
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
@Service("sysEnterpriseService")
public class SysEnterpriseServiceImpl implements SysEnterpriseService {

	@Resource
	private SysEnterpriseDao sysEnterpriseDao;
	
	@Override
	public Page<SysEnterprise> findByPage(SysEnterprise sysEnterprise, Page<SysEnterprise> page) {

		page.setResult(sysEnterpriseDao.find(sysEnterprise, page));
		
		return page;
	}
	
	@Override
	public List<SysEnterprise> findBySearch(SysEnterprise sysEnterprise) {

		return sysEnterpriseDao.find(sysEnterprise);
	}
	
	@Override
	public SysEnterprise getById(Long id) {

		return sysEnterpriseDao.getById(id);
	}

	@Override
	public void add(SysEnterprise sysEnterprise) {

		sysEnterpriseDao.add(sysEnterprise);
	}
	
	@Override
	public void update(SysEnterprise sysEnterprise) {

		sysEnterpriseDao.update(sysEnterprise);
	}

	@Override
	public void delete(Long id) {

		sysEnterpriseDao.delete(id);
	}
 	
}