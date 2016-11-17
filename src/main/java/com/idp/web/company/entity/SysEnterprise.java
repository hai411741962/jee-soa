package com.idp.web.company.entity;
import java.io.Serializable;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 公司管理实体类.
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
public class SysEnterprise extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**公司名称*/
	private String name;
	/**法人姓名*/
	private String legal;
	/**身份证号*/
	private String identcode;
	/**通讯地址*/
	private String address;
	/**联系方式*/
	private String enterphone;
	/**企业传真*/
	private String enterfox;
	/**邮编*/
	private String enterzipcode;
	/**组织机构代码*/
	private String orgcode;
	/**省编码*/
	private String areap;
	/**市编码*/
	private String areac;
	/**区编码*/
	private String areaa;
	/**公司编号*/
	private String enterpisecode;
	/**根节点*/
	private Long pid;
	
	/**
	 *方法: 取得Long
	 *@return: Long  id
	 */
	public Long getId(){
		return this.id;
	}

	/**
	 *方法: 设置Long
	 *@param: Long  id
	 */
	public void setId(Long id){
		this.id = id;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  公司名称
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置String
	 *@param: String  公司名称
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  法人姓名
	 */
	public String getLegal(){
		return this.legal;
	}

	/**
	 *方法: 设置String
	 *@param: String  法人姓名
	 */
	public void setLegal(String legal){
		this.legal = legal;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  身份证号
	 */
	public String getIdentcode(){
		return this.identcode;
	}

	/**
	 *方法: 设置String
	 *@param: String  身份证号
	 */
	public void setIdentcode(String identcode){
		this.identcode = identcode;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  通讯地址
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置String
	 *@param: String  通讯地址
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  联系方式
	 */
	public String getEnterphone(){
		return this.enterphone;
	}

	/**
	 *方法: 设置String
	 *@param: String  联系方式
	 */
	public void setEnterphone(String enterphone){
		this.enterphone = enterphone;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  企业传真
	 */
	public String getEnterfox(){
		return this.enterfox;
	}

	/**
	 *方法: 设置String
	 *@param: String  企业传真
	 */
	public void setEnterfox(String enterfox){
		this.enterfox = enterfox;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  邮编
	 */
	public String getEnterzipcode(){
		return this.enterzipcode;
	}

	/**
	 *方法: 设置String
	 *@param: String  邮编
	 */
	public void setEnterzipcode(String enterzipcode){
		this.enterzipcode = enterzipcode;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  组织机构代码
	 */
	public String getOrgcode(){
		return this.orgcode;
	}

	/**
	 *方法: 设置String
	 *@param: String  组织机构代码
	 */
	public void setOrgcode(String orgcode){
		this.orgcode = orgcode;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  省编码
	 */
	public String getAreap(){
		return this.areap;
	}

	/**
	 *方法: 设置String
	 *@param: String  省编码
	 */
	public void setAreap(String areap){
		this.areap = areap;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  市编码
	 */
	public String getAreac(){
		return this.areac;
	}

	/**
	 *方法: 设置String
	 *@param: String  市编码
	 */
	public void setAreac(String areac){
		this.areac = areac;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  区编码
	 */
	public String getAreaa(){
		return this.areaa;
	}

	/**
	 *方法: 设置String
	 *@param: String  区编码
	 */
	public void setAreaa(String areaa){
		this.areaa = areaa;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  公司编号
	 */
	public String getEnterpisecode(){
		return this.enterpisecode;
	}

	/**
	 *方法: 设置String
	 *@param: String  公司编号
	 */
	public void setEnterpisecode(String enterpisecode){
		this.enterpisecode = enterpisecode;
	}
	
	/**
	 *方法: 取得Long
	 *@return: Long  根节点
	 */
	public Long getPid(){
		return this.pid;
	}

	/**
	 *方法: 设置Long
	 *@param: Long  根节点
	 */
	public void setPid(Long pid){
		this.pid = pid;
	}
	
}
