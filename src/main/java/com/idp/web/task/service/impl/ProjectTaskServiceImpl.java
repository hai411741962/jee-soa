package com.idp.web.task.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.task.dao.ProjectTaskDao;
import com.idp.web.task.entity.ProjectTask;
import com.idp.web.task.entity.ProjectTaskFrom;
import com.idp.web.task.service.ProjectTaskService;

/**
 * 
 * 任务管理service实现类
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
@Service("projectTaskService")
public class ProjectTaskServiceImpl implements ProjectTaskService {

	@Resource
	private ProjectTaskDao projectTaskDao;
	
	@Override
	public Page<ProjectTask> findByPage(ProjectTask projectTask, Page<ProjectTask> page) {

		page.setResult(projectTaskDao.find(projectTask, page));
		
		return page;
	}
	
	@Override
	public List<ProjectTask> findBySearch(ProjectTask projectTask) {

		return projectTaskDao.find(projectTask);
	}
	
	@Override
	public ProjectTask getById(Integer id) {

		return projectTaskDao.getById(id);
	}

	@Override
	public void add(ProjectTask projectTask) {

		projectTaskDao.add(projectTask);
	}
	
	@Override
	public void update(ProjectTask projectTask) {

		projectTaskDao.update(projectTask);
	}

	@Override
	public void delete(Integer id) {

		projectTaskDao.delete(id);
	}

	@Override
	public List<ProjectTaskFrom> findBySearchforExcel(ProjectTask projectTask) {
		// TODO Auto-generated method stub
		return projectTaskDao.findforexcel(projectTask);
	}
 	
}