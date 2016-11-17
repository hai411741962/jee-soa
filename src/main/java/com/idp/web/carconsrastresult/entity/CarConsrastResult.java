package com.idp.web.carconsrastresult.entity;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 车辆对比结果管理瀹炰綋绫�.
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-27 14:01 yhg
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
public class CarConsrastResult extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**结果类型*/
	private Integer resultType;
	/**结果说明*/
	private String resultRemark;
	/**车牌号*/
	private String plateCode;
	/**车身颜色*/
	private String plateColor;
	/**处理状态*/
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
	 *@return: Integer  结果类型
	 */
	public Integer getResultType(){
		return this.resultType;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  结果类型
	 */
	public void setResultType(Integer resultType){
		this.resultType = resultType;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  结果说明
	 */
	public String getResultRemark(){
		return this.resultRemark;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  结果说明
	 */
	public void setResultRemark(String resultRemark){
		this.resultRemark = resultRemark;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  车牌号
	 */
	public String getPlateCode(){
		return this.plateCode;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  车牌号
	 */
	public void setPlateCode(String plateCode){
		this.plateCode = plateCode;
	}
	
	/**
	 *鏂规硶: 鍙栧緱String
	 *@return: String  车身颜色
	 */
	public String getPlateColor(){
		return this.plateColor;
	}

	/**
	 *鏂规硶: 璁剧疆String
	 *@param: String  车身颜色
	 */
	public void setPlateColor(String plateColor){
		this.plateColor = plateColor;
	}
	
	/**
	 *鏂规硶: 鍙栧緱Integer
	 *@return: Integer  处理状态
	 */
	public Integer getStatus(){
		return this.status;
	}

	/**
	 *鏂规硶: 璁剧疆Integer
	 *@param: Integer  处理状态
	 */
	public void setStatus(Integer status){
		this.status = status;
	}
	
}
