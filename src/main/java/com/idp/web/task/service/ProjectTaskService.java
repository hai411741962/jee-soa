package com.idp.web.task.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.task.entity.ProjectTask;
import com.idp.web.task.entity.ProjectTaskFrom;

/**
 * 
 * 任务管理service接口
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
public interface ProjectTaskService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param projectTask
	 * @param page
	 * @return
	 */
	public Page<ProjectTask> findByPage(ProjectTask projectTask,Page<ProjectTask> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param projectTask
	 * @return
	 */
	public List<ProjectTask> findBySearch(ProjectTask projectTask);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param ProjectTask
	 * @return
	 */
	public ProjectTask getById(Integer id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param projectTask
	 */
	public void add(ProjectTask projectTask);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param projectTask
	 */
	public void update(ProjectTask projectTask);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-18 11:13 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Integer id);
	
	
	/**
	 * 
	 * @param projectTask
	 * @return
	 */
	public List<ProjectTaskFrom> findBySearchforExcel(ProjectTask projectTask);
}
