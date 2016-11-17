package com.idp.web.shconstrastreport.service.impl;
import com.idp.web.shconstrastreport.service.ShConstrastReportService;
import com.idp.web.shconstrastreport.dao.ShConstrastReportDao;
import com.idp.web.shconstrastreport.entity.ShConstrastReport;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;

/**
 * 
 * 势航表数据对比报告service瀹炵幇绫�
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-23 10:54 yhg
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
@Service("shConstrastReportService")
public class ShConstrastReportServiceImpl implements ShConstrastReportService {

	@Resource
	private ShConstrastReportDao shConstrastReportDao;
	
	@Override
	public Page<ShConstrastReport> findByPage(ShConstrastReport shConstrastReport, Page<ShConstrastReport> page) {

		page.setResult(shConstrastReportDao.find(shConstrastReport, page));
		
		return page;
	}
	
	@Override
	public List<ShConstrastReport> findBySearch(ShConstrastReport shConstrastReport) {

		return shConstrastReportDao.find(shConstrastReport);
	}
	
	@Override
	public ShConstrastReport getById(Long id) {

		return shConstrastReportDao.getById(id);
	}

	@Override
	public void add(ShConstrastReport shConstrastReport) {

		shConstrastReportDao.add(shConstrastReport);
	}
	
	@Override
	public void update(ShConstrastReport shConstrastReport) {

		shConstrastReportDao.update(shConstrastReport);
	}

	@Override
	public void delete(Long id) {

		shConstrastReportDao.delete(id);
	}
 	
}