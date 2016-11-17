package com.idp.web.task.dao;
import java.util.List;

import com.idp.common.base.BaseDao;
import com.idp.web.task.entity.ProjectTask;
import com.idp.web.task.entity.ProjectTaskFrom;
import com.idp.web.task.entity.ProjectTaskFrom;

/**
 * 
 * 任务管理dao接口.
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
public interface ProjectTaskDao extends BaseDao<ProjectTask, Integer> {

	List<ProjectTaskFrom> findforexcel(ProjectTask projectTask);


}