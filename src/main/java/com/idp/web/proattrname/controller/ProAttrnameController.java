package com.idp.web.proattrname.controller;
import com.idp.web.proattrname.entity.ProAttrname;
import com.idp.web.proattrname.service.ProAttrnameService;
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
 * 属性名管理controller
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	2016-09-15 21:14 yhg
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
@RequestMapping("/proAttrname")
public class ProAttrnameController extends BaseController {

	private Logger logger = Logger.getLogger(ProAttrnameController.class);

	@Resource
	private ProAttrnameService proAttrnameService;
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	鍒濆鍖栨煡璇㈤〉闈�
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "proattrname/proAttrnameSearch";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param proAttrname
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(ProAttrname proAttrname,Page<ProAttrname> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", proAttrnameService.findByPage(proAttrname, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "proattrname/proAttrnameList";
	}

	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	鏂板淇敼椤甸潰鍒濆鍖�
	 * </pre>
	 * 
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/proAttrname")
	public String proAttrname(Long id,HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(id)){
				
				ProAttrname proAttrname = proAttrnameService.getById(id);
				request.setAttribute("proAttrname", proAttrname);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "proattrname/proAttrname";
	}
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-15 21:14 yhg
	 * 	淇濆瓨
	 * </pre>
	 * 
	 * @param proAttrname
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(ProAttrname proAttrname){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 淇敼
			if(ValidateUtils.isNotEmpty(proAttrname.getId())){
				
				proAttrnameService.update(proAttrname);
			}
			// 鏂板
			else{
				
				proAttrnameService.add(proAttrname);
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
	 * 	2016-09-15 21:14 yhg
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
			
			proAttrnameService.delete(id);
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
