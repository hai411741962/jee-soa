package com.idp.web.zccustomer.entity;
import java.io.Serializable;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 客户管理实体类.
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
public class ZcCustomer extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**客户名称*/
	private String name;
	/**联系方式*/
	private String mobile;
	/**送货地址*/
	private String address;
	/**客户类型*/
	private Integer type;
	/**客户编码*/
	private String code;
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  id
	 */

	/**
	 *方法: 取得String
	 *@return: String  客户名称
	 */
	public String getName(){
		return this.name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 *方法: 设置String
	 *@param: String  客户名称
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  联系方式
	 */
	public String getMobile(){
		return this.mobile;
	}

	/**
	 *方法: 设置String
	 *@param: String  联系方式
	 */
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  送货地址
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置String
	 *@param: String  送货地址
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  客户类型
	 */
	public Integer getType(){
		return this.type;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  客户类型
	 */
	public void setType(Integer type){
		this.type = type;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  客户编码
	 */
	public String getCode(){
		return this.code;
	}

	/**
	 *方法: 设置String
	 *@param: String  客户编码
	 */
	public void setCode(String code){
		this.code = code;
	}
	
}
