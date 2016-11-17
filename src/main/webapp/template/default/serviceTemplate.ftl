<#if packageStyle == "service">
package ${sourceBasePackage}.${entityPackage}.service;
import ${sourceBasePackage}.${entityPackage}.entity.${className};
<#else>
package ${sourceBasePackage}.service.${entityPackage};
import ${sourceBasePackage}.entity.${entityPackage}.${className};
</#if>
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * ${description}service鎺ュ彛
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
public interface ${className}Service{
	
 	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param ${className?uncap_first}
	 * @param page
	 * @return
	 */
	public Page<${className}> findByPage(${className} ${className?uncap_first},Page<${className}> page);
	
	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	鏌ヨ
	 * </pre>
	 * 
	 * @param ${className?uncap_first}
	 * @return
	 */
	public List<${className}> findBySearch(${className} ${className?uncap_first});
	
	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	閫氳繃ID鏌ヨ
	 * </pre>
	 * 
	 * @param ${className}
	 * @return
	 */
	public ${className} getById(${pkType} ${pkField});
	
	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	鏂板
	 * </pre>
	 * 
	 * @param ${className?uncap_first}
	 */
	public void add(${className} ${className?uncap_first});
	
	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	淇敼
	 * </pre>
	 * 
	 * @param ${className?uncap_first}
	 */
	public void update(${className} ${className?uncap_first});
	
	/**
	 * 
	 * <pre>
	 * 	${createDate} ${author}
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param ${pkField}
	 */
	public void delete(${pkType} ${pkField});
}
