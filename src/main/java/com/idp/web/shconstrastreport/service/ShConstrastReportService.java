package com.idp.web.shconstrastreport.service;
import com.idp.web.shconstrastreport.entity.ShConstrastReport;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 势航表数据对比报告service鎺ュ彛
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
public interface ShConstrastReportService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param shConstrastReport
	 * @param page
	 * @return
	 */
	public Page<ShConstrastReport> findByPage(ShConstrastReport shConstrastReport,Page<ShConstrastReport> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	鏌ヨ
	 * </pre>
	 * 
	 * @param shConstrastReport
	 * @return
	 */
	public List<ShConstrastReport> findBySearch(ShConstrastReport shConstrastReport);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	閫氳繃ID鏌ヨ
	 * </pre>
	 * 
	 * @param ShConstrastReport
	 * @return
	 */
	public ShConstrastReport getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	鏂板
	 * </pre>
	 * 
	 * @param shConstrastReport
	 */
	public void add(ShConstrastReport shConstrastReport);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	淇敼
	 * </pre>
	 * 
	 * @param shConstrastReport
	 */
	public void update(ShConstrastReport shConstrastReport);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
