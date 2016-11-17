package com.idp.web.proattrname.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 属性名管理瀹炰綋绫�.
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
public class ProAttrname extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**属性名称*/
	private String title;
	/**类型id*/
	private Integer protypeId;
	
	//类型名称
	private  String protypeName;
	
	/**
	 *鏂规硶: 鍙栧緱Long
	 *@return: Long  id
	 */
	public Long getId(){
		return this.id;
	}

	/**
	 *鏂规硶: 璁剧疆Long
	 *@param: Long  id
	 */
	public void setId(Long id){
		this.id = id;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  属性名称
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  属性名称
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  类型id
	 */
	public Integer getProtypeId(){
		return this.protypeId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  类型id
	 */
	public void setProtypeId(Integer protypeId){
		this.protypeId = protypeId;
	}

	public String getProtypeName() {
		return protypeName;
	}

	public void setProtypeName(String protypeName) {
		this.protypeName = protypeName;
	}
	
}
