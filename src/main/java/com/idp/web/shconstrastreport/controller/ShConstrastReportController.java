package com.idp.web.shconstrastreport.controller;
import com.idp.web.shconstrastreport.entity.ShConstrastReport;
import com.idp.web.shconstrastreport.service.ShConstrastReportService;
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
 * 势航表数据对比报告controller
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-23 10:54 yhg
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
@RequestMapping("/shConstrastReport")
public class ShConstrastReportController extends BaseController {

	private Logger logger = Logger.getLogger(ShConstrastReportController.class);

	@Resource
	private ShConstrastReportService shConstrastReportService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	鍒濆鍖栨煡璇㈤〉闈�
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "shconstrastreport/shConstrastReportSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param shConstrastReport
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ShConstrastReport shConstrastReport,Page<ShConstrastReport> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", shConstrastReportService.findByPage(shConstrastReport, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "shconstrastreport/shConstrastReportList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	鏂板淇敼椤甸潰鍒濆鍖�
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/shConstrastReport")
	public String shConstrastReport(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ShConstrastReport shConstrastReport = shConstrastReportService.getById(id);
				request.setAttribute("shConstrastReport", shConstrastReport);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "shconstrastreport/shConstrastReport";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-23 10:54 yhg
	 * 	淇濆瓨
	 * </pre>
	 * 
	 * @param shConstrastReport
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ShConstrastReport shConstrastReport){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 淇敼
			if(ValidateUtils.isNotEmpty(shConstrastReport.getId())){
				
				shConstrastReportService.update(shConstrastReport);
			}
			// 鏂板
			else{
				
				shConstrastReportService.add(shConstrastReport);
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
	 * 	2016-09-23 10:54 yhg
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
			
			shConstrastReportService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
