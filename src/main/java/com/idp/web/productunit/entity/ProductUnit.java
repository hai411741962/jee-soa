package com.idp.web.productunit.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 单位管理瀹炰綋绫�.
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-13 11:10 yhg
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
public class ProductUnit extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**单位*/
	private Long id;
	/**单位名称*/
	private String title;
	
	/**
	 *鏂规硶: 鍙栧緱Long
	 *@return: Long  单位
	 */
	public Long getId(){
		return this.id;
	}

	/**
	 *鏂规硶: 璁剧疆Long
	 *@param: Long  单位
	 */
	public void setId(Long id){
		this.id = id;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  单位名称
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  单位名称
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
}
