package com.idp.web.proattrname.service.impl;
import com.idp.web.proattrname.service.ProAttrnameService;
import com.idp.web.proattrname.dao.ProAttrnameDao;
import com.idp.web.proattrname.entity.ProAttrname;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;

/**
 * 
 * 属性名管理service瀹炵幇绫�
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-15 21:14 yhg
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
@Service("proAttrnameService")
public class ProAttrnameServiceImpl implements ProAttrnameService {

	@Resource
	private ProAttrnameDao proAttrnameDao;
	
	@Override
	public Page<ProAttrname> findByPage(ProAttrname proAttrname, Page<ProAttrname> page) {

		page.setResult(proAttrnameDao.find(proAttrname, page));
		
		return page;
	}
	
	@Override
	public List<ProAttrname> findBySearch(ProAttrname proAttrname) {

		return proAttrnameDao.find(proAttrname);
	}
	
	@Override
	public ProAttrname getById(Long id) {

		return proAttrnameDao.getById(id);
	}

	@Override
	public void add(ProAttrname proAttrname) {

		proAttrnameDao.add(proAttrname);
	}
	
	@Override
	public void update(ProAttrname proAttrname) {

		proAttrnameDao.update(proAttrname);
	}

	@Override
	public void delete(Long id) {

		proAttrnameDao.delete(id);
	}
 	
}