package com.idp.web.car.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.car.entity.Car;

/**
 * 
 * 车辆service接口
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
public interface CarService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param car
	 * @param page
	 * @return
	 */
	public Page<Car> findByPage(Car car,Page<Car> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param car
	 * @return
	 */
	public List<Car> findBySearch(Car car);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param Car
	 * @return
	 */
	public Car getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param car
	 */
	public void add(Car car);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param car
	 */
	public void update(Car car);
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
