package com.idp.web.car.entity;
import java.io.Serializable;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 车辆实体类.
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-16 11:21 yhg
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
public class Car extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**id*/
	private Long id;
	/**颜色*/
	private Integer carColor;
	
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
	 *@return: Integer  颜色
	 */
	public Integer getCarColor(){
		return this.carColor;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  颜色
	 */
	public void setCarColor(Integer carColor){
		this.carColor = carColor;
	}
	
}
