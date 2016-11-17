package com.idp.web.carconsrastresult.controller;
import com.idp.web.carconsrastresult.entity.CarConsrastResult;
import com.idp.web.carconsrastresult.service.CarConsrastResultService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.persistence.Page;
import com.idp.common.util.ValidateUtils;

import net.sf.json.JSONObject;

/**
 * 
 * 车辆对比结果管理controller
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
@Controller
@RequestMapping("/carConsrastResult")
public class CarConsrastResultController extends BaseController {

	private Logger logger = Logger.getLogger(CarConsrastResultController.class);

	@Resource
	private CarConsrastResultService carConsrastResultService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	鍒濆鍖栨煡璇㈤〉闈�
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "carconsrastresult/carConsrastResultSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param carConsrastResult
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(CarConsrastResult carConsrastResult,Page<CarConsrastResult> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", carConsrastResultService.findByPage(carConsrastResult, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "carconsrastresult/carConsrastResultList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	鏂板淇敼椤甸潰鍒濆鍖�
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/carConsrastResult")
	public String carConsrastResult(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				CarConsrastResult carConsrastResult = carConsrastResultService.getById(id);
				request.setAttribute("carConsrastResult", carConsrastResult);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "carconsrastresult/carConsrastResult";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	淇濆瓨
	 * </pre>
	 * 
	 * @param carConsrastResult
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(CarConsrastResult carConsrastResult){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 淇敼
			if(ValidateUtils.isNotEmpty(carConsrastResult.getId())){
				
				carConsrastResultService.update(carConsrastResult);
			}
			// 鏂板
			else{
				
				carConsrastResultService.add(carConsrastResult);
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
	 * 	2016-09-27 14:01 yhg
	 * 	鍒犻櫎
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
			
			carConsrastResultService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
