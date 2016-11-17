package com.idp.web.producttype.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 产品类型管理实体类.
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-07 14:44 yhg
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
public class ProductType extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**公司id*/
	private Integer companyId;
	/**上级id*/
	private Integer parentId;
	/**类型名称*/
	private String protypeName;
	/**图标*/
	private String protypeIcon;
	/**排序*/
	private Integer sort;
	/**删除状态*/
	private Integer delStatus;
	/**创建时间*/
	private Date createData;
	
	
	/**
	 * 非持久字段
	 */
	/** 记录下级菜单的数量 */
	private Integer childNum;
	/** 父级菜单 */
	private ProductType parentMenu;
	/** 子菜单集合 */
	private List<ProductType> children = new ArrayList<ProductType>();
	
	
	
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
	 *方法: 取得Integer
	 *@return: Integer  公司id
	 */
	public Integer getCompanyId(){
		return this.companyId;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  公司id
	 */
	public void setCompanyId(Integer companyId){
		this.companyId = companyId;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  上级id
	 */
	public Integer getParentId(){
		return this.parentId;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  上级id
	 */
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  类型名称
	 */
	public String getProtypeName(){
		return this.protypeName;
	}

	/**
	 *方法: 设置String
	 *@param: String  类型名称
	 */
	public void setProtypeName(String protypeName){
		this.protypeName = protypeName;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  图标
	 */
	public String getProtypeIcon(){
		return this.protypeIcon;
	}

	/**
	 *方法: 设置String
	 *@param: String  图标
	 */
	public void setProtypeIcon(String protypeIcon){
		this.protypeIcon = protypeIcon;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  排序
	 */
	public Integer getSort(){
		return this.sort;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  排序
	 */
	public void setSort(Integer sort){
		this.sort = sort;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  删除状态
	 */
	public Integer getDelStatus(){
		return this.delStatus;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  删除状态
	 */
	public void setDelStatus(Integer delStatus){
		this.delStatus = delStatus;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  创建时间
	 */
	public Date getCreateData(){
		return this.createData;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  创建时间
	 */
	public void setCreateData(Date createData){
		this.createData = createData;
	}

	public Integer getChildNum() {
		return childNum;
	}

	public void setChildNum(Integer childNum) {
		this.childNum = childNum;
	}

	

	public ProductType getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(ProductType parentMenu) {
		this.parentMenu = parentMenu;
	}

	public List<ProductType> getChildren() {
		return children;
	}

	public void setChildren(List<ProductType> children) {
		this.children = children;
	}
	
	
	
}
