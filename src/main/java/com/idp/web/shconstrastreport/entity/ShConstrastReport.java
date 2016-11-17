package com.idp.web.shconstrastreport.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 势航表数据对比报告瀹炰綋绫�.
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-23 10:54 yhg
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
public class ShConstrastReport extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**子平台id*/
	private Integer platformId;
	/**对比类型*/
	private Integer consrastType;
	/**对比开始时间*/
	private Date startTime;
	/**对比结束时间*/
	private Date endTime;
	/**对比状态*/
	private Integer status;
	
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
	 *@return: Integer  子平台id
	 */
	public Integer getPlatformId(){
		return this.platformId;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  子平台id
	 */
	public void setPlatformId(Integer platformId){
		this.platformId = platformId;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  对比类型
	 */
	public Integer getConsrastType(){
		return this.consrastType;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  对比类型
	 */
	public void setConsrastType(Integer consrastType){
		this.consrastType = consrastType;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Date
	 *@return: Date  对比开始时间
	 */
	public Date getStartTime(){
		return this.startTime;
	}

	/**
	 *鏂规硶: 璁剧疆Date
	 *@param: Date  对比开始时间
	 */
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Date
	 *@return: Date  对比结束时间
	 */
	public Date getEndTime(){
		return this.endTime;
	}

	/**
	 *鏂规硶: 璁剧疆Date
	 *@param: Date  对比结束时间
	 */
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  对比状态
	 */
	public Integer getStatus(){
		return this.status;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  对比状态
	 */
	public void setStatus(Integer status){
		this.status = status;
	}
	
}
