package com.idp.web.proattrname.service;
import com.idp.web.proattrname.entity.ProAttrname;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 属性名管理service鎺ュ彛
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
public interface ProAttrnameService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param proAttrname
	 * @param page
	 * @return
	 */
	public Page<ProAttrname> findByPage(ProAttrname proAttrname,Page<ProAttrname> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	鏌ヨ
	 * </pre>
	 * 
	 * @param proAttrname
	 * @return
	 */
	public List<ProAttrname> findBySearch(ProAttrname proAttrname);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	閫氳繃ID鏌ヨ
	 * </pre>
	 * 
	 * @param ProAttrname
	 * @return
	 */
	public ProAttrname getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	鏂板
	 * </pre>
	 * 
	 * @param proAttrname
	 */
	public void add(ProAttrname proAttrname);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	淇敼
	 * </pre>
	 * 
	 * @param proAttrname
	 */
	public void update(ProAttrname proAttrname);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
