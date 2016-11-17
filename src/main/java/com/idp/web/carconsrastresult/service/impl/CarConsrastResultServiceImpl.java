package com.idp.web.carconsrastresult.service.impl;
import com.idp.web.carconsrastresult.service.CarConsrastResultService;
import com.idp.web.carconsrastresult.dao.CarConsrastResultDao;
import com.idp.web.carconsrastresult.entity.CarConsrastResult;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;

/**
 * 
 * 车辆对比结果管理service瀹炵幇绫�
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
@Service("carConsrastResultService")
public class CarConsrastResultServiceImpl implements CarConsrastResultService {

	@Resource
	private CarConsrastResultDao carConsrastResultDao;
	
	@Override
	public Page<CarConsrastResult> findByPage(CarConsrastResult carConsrastResult, Page<CarConsrastResult> page) {

		page.setResult(carConsrastResultDao.find(carConsrastResult, page));
		
		return page;
	}
	
	@Override
	public List<CarConsrastResult> findBySearch(CarConsrastResult carConsrastResult) {

		return carConsrastResultDao.find(carConsrastResult);
	}
	
	@Override
	public CarConsrastResult getById(Long id) {

		return carConsrastResultDao.getById(id);
	}

	@Override
	public void add(CarConsrastResult carConsrastResult) {

		carConsrastResultDao.add(carConsrastResult);
	}
	
	@Override
	public void update(CarConsrastResult carConsrastResult) {

		carConsrastResultDao.update(carConsrastResult);
	}

	@Override
	public void delete(Long id) {

		carConsrastResultDao.delete(id);
	}
 	
}