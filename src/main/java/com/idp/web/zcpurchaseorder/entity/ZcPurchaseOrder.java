package com.idp.web.zcpurchaseorder.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 采购单管理实体类.
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-06 15:11 yhg
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
public class ZcPurchaseOrder extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**订单编号*/
	private String code;
	/**日期*/
	private Date startTime;
	/**到期日*/
	private Date endTime;
	/**供应商id*/
	private Integer supplierId;
	/**到货地址*/
	private String address;
	/**定金*/
	private BigDecimal dmoney;
	/**税率*/
	private BigDecimal shuilv;
	/**制单人*/
	private String zhidanren;
	/**审核人*/
	private String shenheren;
	/**状态*/
	private Integer state;
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  id
	 */

	
	/**
	 *方法: 取得String
	 *@return: String  订单编号
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
	 *@param: String  订单编号
	 */
	public void setCode(String code){
		this.code = code;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  日期
	 */
	public Date getStartTime(){
		return this.startTime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  日期
	 */
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  到期日
	 */
	public Date getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  到期日
	 */
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  供应商id
	 */
	public Integer getSupplierId(){
		return this.supplierId;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  供应商id
	 */
	public void setSupplierId(Integer supplierId){
		this.supplierId = supplierId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  到货地址
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置String
	 *@param: String  到货地址
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  定金
	 */
	public BigDecimal getDmoney(){
		return this.dmoney;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  定金
	 */
	public void setDmoney(BigDecimal dmoney){
		this.dmoney = dmoney;
	}
	
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  税率
	 */
	public BigDecimal getShuilv(){
		return this.shuilv;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  税率
	 */
	public void setShuilv(BigDecimal shuilv){
		this.shuilv = shuilv;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  制单人
	 */
	public String getZhidanren(){
		return this.zhidanren;
	}

	/**
	 *方法: 设置String
	 *@param: String  制单人
	 */
	public void setZhidanren(String zhidanren){
		this.zhidanren = zhidanren;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  审核人
	 */
	public String getShenheren(){
		return this.shenheren;
	}

	/**
	 *方法: 设置String
	 *@param: String  审核人
	 */
	public void setShenheren(String shenheren){
		this.shenheren = shenheren;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  状态
	 */
	public Integer getState(){
		return this.state;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  状态
	 */
	public void setState(Integer state){
		this.state = state;
	}
	
}
