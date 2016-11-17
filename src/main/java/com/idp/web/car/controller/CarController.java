package com.idp.web.car.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;
import com.idp.web.car.entity.Car;
import com.idp.web.car.service.CarService;

import net.sf.json.JSONObject;

/**
 * 
 * 车辆controller
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
@Controller
@RequestMapping("/car")
public class CarController extends BaseController {

	private Logger logger = Logger.getLogger(CarController.class);

	@Resource
	private CarService carService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	初始化查询页面
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "car/carSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param car
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(Car car,Page<Car> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", carService.findByPage(car, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "car/carList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	新增修改页面初始化
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/car")
	public String car(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				Car car = carService.getById(id);
				request.setAttribute("car", car);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "car/car";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	保存
	 * </pre>
	 * 
	 * @param car
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(Car car){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 修改
			if(ValidateUtils.isNotEmpty(car.getId())){
				
				carService.update(car);
			}
			// 新增
			else{
				
				carService.add(car);
			}
			json.put("result", "save_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "save_fail");
		}
		
		return json.toString();
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-08-16 11:21 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id){
		
		JSONObject json = new JSONObject();
		
		try {
			
			carService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
