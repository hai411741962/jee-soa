package com.idp.web.car.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.idp.common.persistence.Page;
import com.idp.web.car.dao.CarDao;
import com.idp.web.car.entity.Car;
import com.idp.web.car.service.CarService;

/**
 * 
 * 车辆service实现类
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
@Service("carService")
public class CarServiceImpl implements CarService {

	@Resource
	private CarDao carDao;
	
	@Override
	public Page<Car> findByPage(Car car, Page<Car> page) {

		page.setResult(carDao.find(car, page));
		
		return page;
	}
	
	@Override
	public List<Car> findBySearch(Car car) {

		return carDao.find(car);
	}
	
	@Override
	public Car getById(Long id) {

		return carDao.getById(id);
	}

	@Override
	public void add(Car car) {

		carDao.add(car);
	}
	
	@Override
	public void update(Car car) {

		carDao.update(car);
	}

	@Override
	public void delete(Long id) {

		carDao.delete(id);
	}
 	
}