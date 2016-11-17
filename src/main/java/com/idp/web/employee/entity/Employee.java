package com.idp.web.employee.entity;
import java.io.Serializable;
import java.util.Date;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 员工管理实体类.
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-18 10:03 yhg
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
public class Employee extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**addressid*/
	private String addressid;
	/**deptid*/
	private String deptid;
	/**compid*/
	private String compid;
	/**compname*/
	private String 所属公司;
	/**name*/
	private String 姓名;
	/**age*/
	private Integer 年龄;
	/**sex*/
	private Integer 性别;
	/**post*/
	private String post;
	/**department*/
	private String 所属部门;
	/**title*/
	private String title;
	/**moble*/
	private String moble;
	/**phone*/
	private String 手机号;
	/**address*/
	private String 地址;
	/**idcard*/
	private String idcard;
	/**photo表photoid,格式：photoid,photoid*/
	private String idcardimg;
	/**photo表photoid*/
	private String 头像;
	/**employdate*/
	private Date employdate;
	/**enddate*/
	private Date enddate;
	/**email*/
	private String email;
	/**qq*/
	private String qq;
	/**wechat*/
	private String 微信;
	/**weibo*/
	private String 微博;
	/**dingding*/
	private String dingding;
	/**type*/
	private Integer 类型;
	/**note*/
	private String note;
	/**createtime*/
	private Date createtime;
	/**starttime*/
	private Date starttime;
	/**endtime*/
	private Date endtime;
	/**sort*/
	private Integer 排序;
	/**status*/
	private Integer 状态;
	/**barcode*/
	private String barcode;
	
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
	 *@return: String  addressid
	 */
	public String getAddressid(){
		return this.addressid;
	}

	/**
	 *方法: 设置String
	 *@param: String  addressid
	 */
	public void setAddressid(String addressid){
		this.addressid = addressid;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  deptid
	 */
	public String getDeptid(){
		return this.deptid;
	}

	/**
	 *方法: 设置String
	 *@param: String  deptid
	 */
	public void setDeptid(String deptid){
		this.deptid = deptid;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  compid
	 */
	public String getCompid(){
		return this.compid;
	}

	/**
	 *方法: 设置String
	 *@param: String  compid
	 */
	public void setCompid(String compid){
		this.compid = compid;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  compname
	 */
	public String get所属公司(){
		return this.所属公司;
	}

	/**
	 *方法: 设置String
	 *@param: String  compname
	 */
	public void set所属公司(String 所属公司){
		this.所属公司 = 所属公司;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  name
	 */
	public String get姓名(){
		return this.姓名;
	}

	/**
	 *方法: 设置String
	 *@param: String  name
	 */
	public void set姓名(String 姓名){
		this.姓名 = 姓名;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  age
	 */
	public Integer get年龄(){
		return this.年龄;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  age
	 */
	public void set年龄(Integer 年龄){
		this.年龄 = 年龄;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  sex
	 */
	public Integer get性别(){
		return this.性别;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  sex
	 */
	public void set性别(Integer 性别){
		this.性别 = 性别;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  post
	 */
	public String getPost(){
		return this.post;
	}

	/**
	 *方法: 设置String
	 *@param: String  post
	 */
	public void setPost(String post){
		this.post = post;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  department
	 */
	public String get所属部门(){
		return this.所属部门;
	}

	/**
	 *方法: 设置String
	 *@param: String  department
	 */
	public void set所属部门(String 所属部门){
		this.所属部门 = 所属部门;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  title
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 *方法: 设置String
	 *@param: String  title
	 */
	public void setTitle(String title){
		this.title = title;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  moble
	 */
	public String getMoble(){
		return this.moble;
	}

	/**
	 *方法: 设置String
	 *@param: String  moble
	 */
	public void setMoble(String moble){
		this.moble = moble;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  phone
	 */
	public String get手机号(){
		return this.手机号;
	}

	/**
	 *方法: 设置String
	 *@param: String  phone
	 */
	public void set手机号(String 手机号){
		this.手机号 = 手机号;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  address
	 */
	public String get地址(){
		return this.地址;
	}

	/**
	 *方法: 设置String
	 *@param: String  address
	 */
	public void set地址(String 地址){
		this.地址 = 地址;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  idcard
	 */
	public String getIdcard(){
		return this.idcard;
	}

	/**
	 *方法: 设置String
	 *@param: String  idcard
	 */
	public void setIdcard(String idcard){
		this.idcard = idcard;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  photo表photoid,格式：photoid,photoid
	 */
	public String getIdcardimg(){
		return this.idcardimg;
	}

	/**
	 *方法: 设置String
	 *@param: String  photo表photoid,格式：photoid,photoid
	 */
	public void setIdcardimg(String idcardimg){
		this.idcardimg = idcardimg;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  photo表photoid
	 */
	public String get头像(){
		return this.头像;
	}

	/**
	 *方法: 设置String
	 *@param: String  photo表photoid
	 */
	public void set头像(String 头像){
		this.头像 = 头像;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  employdate
	 */
	public Date getEmploydate(){
		return this.employdate;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  employdate
	 */
	public void setEmploydate(Date employdate){
		this.employdate = employdate;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  enddate
	 */
	public Date getEnddate(){
		return this.enddate;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  enddate
	 */
	public void setEnddate(Date enddate){
		this.enddate = enddate;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  email
	 */
	public String getEmail(){
		return this.email;
	}

	/**
	 *方法: 设置String
	 *@param: String  email
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  qq
	 */
	public String getQq(){
		return this.qq;
	}

	/**
	 *方法: 设置String
	 *@param: String  qq
	 */
	public void setQq(String qq){
		this.qq = qq;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  wechat
	 */
	public String get微信(){
		return this.微信;
	}

	/**
	 *方法: 设置String
	 *@param: String  wechat
	 */
	public void set微信(String 微信){
		this.微信 = 微信;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  weibo
	 */
	public String get微博(){
		return this.微博;
	}

	/**
	 *方法: 设置String
	 *@param: String  weibo
	 */
	public void set微博(String 微博){
		this.微博 = 微博;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  dingding
	 */
	public String getDingding(){
		return this.dingding;
	}

	/**
	 *方法: 设置String
	 *@param: String  dingding
	 */
	public void setDingding(String dingding){
		this.dingding = dingding;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  type
	 */
	public Integer get类型(){
		return this.类型;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  type
	 */
	public void set类型(Integer 类型){
		this.类型 = 类型;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  note
	 */
	public String getNote(){
		return this.note;
	}

	/**
	 *方法: 设置String
	 *@param: String  note
	 */
	public void setNote(String note){
		this.note = note;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  createtime
	 */
	public Date getCreatetime(){
		return this.createtime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  createtime
	 */
	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  starttime
	 */
	public Date getStarttime(){
		return this.starttime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  starttime
	 */
	public void setStarttime(Date starttime){
		this.starttime = starttime;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  endtime
	 */
	public Date getEndtime(){
		return this.endtime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  endtime
	 */
	public void setEndtime(Date endtime){
		this.endtime = endtime;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  sort
	 */
	public Integer get排序(){
		return this.排序;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  sort
	 */
	public void set排序(Integer 排序){
		this.排序 = 排序;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  status
	 */
	public Integer get状态(){
		return this.状态;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  status
	 */
	public void set状态(Integer 状态){
		this.状态 = 状态;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  barcode
	 */
	public String getBarcode(){
		return this.barcode;
	}

	/**
	 *方法: 设置String
	 *@param: String  barcode
	 */
	public void setBarcode(String barcode){
		this.barcode = barcode;
	}
	
}
