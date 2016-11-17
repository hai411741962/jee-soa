package com.idp.web.task.entity;
import java.io.Serializable;
import java.util.Date;

import com.idp.common.base.BaseEntity;

/**
 * 
 * 任务管理实体类.
 * 
 * <pre>
 * 	历史记录：
 * 	2016-08-18 11:13 yhg
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
public class ProjectTask extends BaseEntity implements Serializable {
	
	
	/**项目任务id*/
	private Long id;
	/**所属模块*/
	private String projectName;
	/**任务名称*/
	private String name;
	/**开始时间*/
	private Date startTime;
	/**结束时间*/
	private Date endTime;
	/**实际开始时间*/
	private Date factStartTime;
	/**实际技术时间*/
	private Date factEndTime;
	/**负责人名称*/
	private String  presideName;
	/**负责人id*/
	private Integer presideUserId;
	/**任务描述*/
	private String remark;
	/**任务完成状态*/
	private Integer status;
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  项目任务id
	 */
	

	/**
	 *方法: 设置Integer
	 *@param: Integer  项目任务id
	 */

	
	/**
	 *方法: 取得String
	 *@return: String  所属模块
	 */
	public String getProjectName(){
		return this.projectName;
	}

	/**
	 *方法: 设置String
	 *@param: String  所属模块
	 */
	public void setProjectName(String projectName){
		this.projectName = projectName;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  任务名称
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置String
	 *@param: String  任务名称
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  开始时间
	 */
	public Date getStartTime(){
		return this.startTime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  开始时间
	 */
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  结束时间
	 */
	public Date getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  结束时间
	 */
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  实际开始时间
	 */
	public Date getFactStartTime(){
		return this.factStartTime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  实际开始时间
	 */
	public void setFactStartTime(Date factStartTime){
		this.factStartTime = factStartTime;
	}
	
	/**
	 *方法: 取得Date
	 *@return: Date  实际技术时间
	 */
	public Date getFactEndTime(){
		return this.factEndTime;
	}

	/**
	 *方法: 设置Date
	 *@param: Date  实际技术时间
	 */
	public void setFactEndTime(Date factEndTime){
		this.factEndTime = factEndTime;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  负责人名称
	 */
	public String getPresideName(){
		return this. presideName;
	}

	/**
	 *方法: 设置String
	 *@param: String  负责人名称
	 */
	public void setPresideName(String  presideName){
		this. presideName =  presideName;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  负责人id
	 */
	public Integer getPresideUserId(){
		return this.presideUserId;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  负责人id
	 */
	public void setPresideUserId(Integer presideUserId){
		this.presideUserId = presideUserId;
	}
	
	/**
	 *方法: 取得String
	 *@return: String  任务描述
	 */
	public String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置String
	 *@param: String  任务描述
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	/**
	 *方法: 取得Integer
	 *@return: Integer  任务完成状态
	 */
	public Integer getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置Integer
	 *@param: Integer  任务完成状态
	 */
	public void setStatus(Integer status){
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
