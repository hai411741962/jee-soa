<#if packageStyle == "service">
package ${sourceBasePackage}.${entityPackage}.controller;
import ${sourceBasePackage}.${entityPackage}.entity.${className};
import ${sourceBasePackage}.${entityPackage}.service.${className}Service;
<#else>
package ${sourceBasePackage}.controller.${entityPackage};
import ${sourceBasePackage}.entity.${entityPackage}.${className};
import ${sourceBasePackage}.service.${entityPackage}.${className}Service;
</#if>
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
 * ${description}controller
 * 
 * <pre>
 * 	鍘嗗彶璁板綍锛�
 * 	${createDate} ${author}
 * 	鏂板缓鏂囦欢
 * </pre>
 * 
 * @author 
 * <pre>
 * SD
 * 	${author}
 * PG
 *	${author}
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
@RequestMapping("/${className?uncap_first}")
public class ${className}Controller extends BaseController {

	private Logger logger = Logger.getLogger(${className}Controller.class);

	@Resource
	private ${className}Service ${className?uncap_first}Service;
	
	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	鍒濆鍖栨煡璇㈤〉闈�
	 * </pre>
	 * 
	 * @return
	 */
	@RequestMapping("/init")
	public String init(){
		
		return "${entityPackage}/${className?uncap_first}Search";
	}
	
	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param ${className?uncap_first}
	 * @param page
	 * @param request
	 * @return
	 */
	@RequestMapping("/list")
	public String list(${className} ${className?uncap_first},Page<${className}> page,HttpServletRequest request){
		
		try {
			
			request.setAttribute("page", ${className?uncap_first}Service.findByPage(${className?uncap_first}, page));
		} catch (Exception e) {
		
			logger.error(e.getMessage(), e);
		}
		
		return "${entityPackage}/${className?uncap_first}List";
	}

	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	鏂板淇敼椤甸潰鍒濆鍖�
	 * </pre>
	 * 
	 * @param ${pkField}
	 * @param request
	 * @return
	 */
	@RequestMapping("/${className?uncap_first}")
	public String ${className?uncap_first}(${pkType} ${pkField},HttpServletRequest request){
		
		try {
			
			if(ValidateUtils.isNotEmpty(${pkField})){
				
				${className} ${className?uncap_first} = ${className?uncap_first}Service.getById(${pkField});
				request.setAttribute("${className?uncap_first}", ${className?uncap_first});
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
		}
		
		return "${entityPackage}/${className?uncap_first}";
	}
	
	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	淇濆瓨
	 * </pre>
	 * 
	 * @param ${className?uncap_first}
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public String save(${className} ${className?uncap_first}){
		
		JSONObject json = new JSONObject();
		
		try {
			
			// 淇敼
			if(ValidateUtils.isNotEmpty(${className?uncap_first}.get${pkField?cap_first}())){
				
				${className?uncap_first}Service.update(${className?uncap_first});
			}
			// 鏂板
			else{
				
				${className?uncap_first}Service.add(${className?uncap_first});
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
	 * 	${createDate} ${author}
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param ${pkField}
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(${pkType} ${pkField}){
		
		JSONObject json = new JSONObject();
		
		try {
			
			${className?uncap_first}Service.delete(${pkField});
			json.put("result", "delete_success");
		} catch (Exception e) {
			
			logger.error(e.getMessage(), e);
			json.put("result", "delete_fail");
		}
		
		return json.toString();
	}
}
