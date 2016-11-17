package com.idp.web.productsku.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 产品SKU瀹炰綋绫�.
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-16 10:47 yhg
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
public class ProductSku extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**产品id*/
	private Integer productId;
	/**属性名id*/
	private Integer attrnameId;
	/**属性值id*/
	private Integer attrvalueId;
	/**产品编码(货号)*/
	private String proCode;
	/**产品库存*/
	private Integer proStock;
	/**销售价格*/
	private BigDecimal salsePrice;
	/**产品名称*/
	private String productName;
	/**属性名名称*/
	private String proAttrName;
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
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  产品id
	 */
	public Integer getProductId(){
		return this.productId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  产品id
	 */
	public void setProductId(Integer productId){
		this.productId = productId;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  属性名id
	 */
	public Integer getAttrnameId(){
		return this.attrnameId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  属性名id
	 */
	public void setAttrnameId(Integer attrnameId){
		this.attrnameId = attrnameId;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  属性值id
	 */
	public Integer getAttrvalueId(){
		return this.attrvalueId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  属性值id
	 */
	public void setAttrvalueId(Integer attrvalueId){
		this.attrvalueId = attrvalueId;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  产品编码(货号)
	 */
	public String getProCode(){
		return this.proCode;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  产品编码(货号)
	 */
	public void setProCode(String proCode){
		this.proCode = proCode;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  产品库存
	 */
	public Integer getProStock(){
		return this.proStock;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  产品库存
	 */
	public void setProStock(Integer proStock){
		this.proStock = proStock;
	}
	
	/**
	 *鏂规硶: 鍙栧緱BigDecimal
	 *@return: BigDecimal  销售价格
	 */
	public BigDecimal getSalsePrice(){
		return this.salsePrice;
	}

	/**
	 *鏂规硶: 璁剧疆BigDecimal
	 *@param: BigDecimal  销售价格
	 */
	public void setSalsePrice(BigDecimal salsePrice){
		this.salsePrice = salsePrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProAttrName() {
		return proAttrName;
	}

	public void setProAttrName(String proAttrName) {
		this.proAttrName = proAttrName;
	}
	
	
	
}
