package com.idp.web.zcsupplier.entity;
import java.io.Serializable;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 供应商管理实体类.
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-06 13:21 yhg
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
public class ZcSupplier extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**供应商编码*/
	private String code;
	/**名称*/
	private String name;
	/**联系方式*/
	private String phone;
	/**联系地址*/
	private String address;
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  id
	 */
	
	
	/**
	 *方法: 取得String
	 *@return: String  供应商编码
	 */
	public String getCode(){
		return this.code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 *方法: 设置String
	 *@param: String  供应商编码
	 */
	public void setCode(String code){
		this.code = code;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  名称
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置String
	 *@param: String  名称
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  联系方式
	 */
	public String getPhone(){
		return this.phone;
	}

	/**
	 *方法: 设置String
	 *@param: String  联系方式
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  联系地址
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置String
	 *@param: String  联系地址
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
}
