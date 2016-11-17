package com.idp.web.zcstock.entity;
import java.io.Serializable;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 存货管理实体类.
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-22 13:37 yhg
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
public class ZcStock extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**存货*/
	private Long id;
	/**存货编码*/
	private String proCode;
	/**存货名称*/
	private String proName;
	/**商品规格*/
	private String proSpacname;
	/**商品价*/
	private BigDecimal proPrice;
	/**优惠价*/
	private BigDecimal proDiscount;
	
	/**
	 *方法: 取得Long
	 *@return: Long  存货
	 */
	public Long getId(){
		return this.id;
	}

	/**
	 *方法: 设置Long
	 *@param: Long  存货
	 */
	public void setId(Long id){
		this.id = id;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  存货编码
	 */
	public String getProCode(){
		return this.proCode;
	}

	/**
	 *方法: 设置String
	 *@param: String  存货编码
	 */
	public void setProCode(String proCode){
		this.proCode = proCode;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  存货名称
	 */
	public String getProName(){
		return this.proName;
	}

	/**
	 *方法: 设置String
	 *@param: String  存货名称
	 */
	public void setProName(String proName){
		this.proName = proName;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  商品规格
	 */
	public String getProSpacname(){
		return this.proSpacname;
	}

	/**
	 *方法: 设置String
	 *@param: String  商品规格
	 */
	public void setProSpacname(String proSpacname){
		this.proSpacname = proSpacname;
	}
	
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  商品价
	 */
	public BigDecimal getProPrice(){
		return this.proPrice;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  商品价
	 */
	public void setProPrice(BigDecimal proPrice){
		this.proPrice = proPrice;
	}
	
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  优惠价
	 */
	public BigDecimal getProDiscount(){
		return this.proDiscount;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  优惠价
	 */
	public void setProDiscount(BigDecimal proDiscount){
		this.proDiscount = proDiscount;
	}
	
}
