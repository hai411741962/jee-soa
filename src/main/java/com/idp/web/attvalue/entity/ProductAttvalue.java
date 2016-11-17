package com.idp.web.attvalue.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 属性值管理瀹炰綋绫�.
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-11 20:44 yhg
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
public class ProductAttvalue extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**属性名id*/
	private Long id;
	/**attId*/
	private Integer attId;
	/**属性值*/
	private Integer attValue;
	/**单位id*/
	private Integer unitId;
	
	/**
	 *鏂规硶: 鍙栧緱Long
	 *@return: Long  属性名id
	 */
	public Long getId(){
		return this.id;
	}

	/**
	 *鏂规硶: 璁剧疆Long
	 *@param: Long  属性名id
	 */
	public void setId(Long id){
		this.id = id;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  attId
	 */
	public Integer getAttId(){
		return this.attId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  attId
	 */
	public void setAttId(Integer attId){
		this.attId = attId;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  属性值
	 */
	public Integer getAttValue(){
		return this.attValue;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  属性值
	 */
	public void setAttValue(Integer attValue){
		this.attValue = attValue;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  单位id
	 */
	public Integer getUnitId(){
		return this.unitId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  单位id
	 */
	public void setUnitId(Integer unitId){
		this.unitId = unitId;
	}
	
}
