package com.idp.web.product.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 产品管理瀹炰綋绫�.
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-14 21:57 yhg
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
public class Product extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**类型id*/
	private Integer typeId;
	/**公司id*/
	private Integer companyId;
	/**产品名称*/
	private String title;
	/**创建时间*/
	private Date createDate;
	/**产品logo*/
	private String productLogo;
	/**删除状态*/
	private String delFlag;
	/**产品描述*/
	private String remark;
	/**排序*/
	private Integer sort;
	
	/**类型名称*/
	private String protypeName;
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
	 *@return: Integer  类型id
	 */
	public Integer getTypeId(){
		return this.typeId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  类型id
	 */
	public void setTypeId(Integer typeId){
		this.typeId = typeId;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  公司id
	 */
	public Integer getCompanyId(){
		return this.companyId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  公司id
	 */
	public void setCompanyId(Integer companyId){
		this.companyId = companyId;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  产品名称
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  产品名称
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Date
	 *@return: Date  创建时间
	 */
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *鏂规硶: 璁剧疆Date
	 *@param: Date  创建时间
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  产品logo
	 */
	public String getProductLogo(){
		return this.productLogo;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  产品logo
	 */
	public void setProductLogo(String productLogo){
		this.productLogo = productLogo;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  删除状态
	 */
	public String getDelFlag(){
		return this.delFlag;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  删除状态
	 */
	public void setDelFlag(String delFlag){
		this.delFlag = delFlag;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  产品描述
	 */
	public String getRemark(){
		return this.remark;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  产品描述
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  排序
	 */
	public Integer getSort(){
		return this.sort;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  排序
	 */
	public void setSort(Integer sort){
		this.sort = sort;
	}

	public String getProtypeName() {
		return protypeName;
	}

	public void setProtypeName(String protypeName) {
		this.protypeName = protypeName;
	}
	
	
	
}
