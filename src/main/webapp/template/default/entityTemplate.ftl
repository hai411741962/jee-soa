<#if packageStyle == "service">
package ${sourceBasePackage}.${entityPackage}.entity;
<#else>
package ${sourceBasePackage}.entity.${entityPackage};
</#if>
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.idp.common.base.BaseEntity;

/**
 * 
 * ${description}瀹炰綋绫�.
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
public class ${className} extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	<#list columns as po>
	/**${po.description}*/
	private ${po.fieldType} ${po.fieldName};
	</#list>
	
	<#list columns as po>
	/**
	 *鏂规硶: 鍙栧緱${po.fieldType}
	 *@return: ${po.fieldType}  ${po.description}
	 */
	public ${po.fieldType} get${po.fieldName?cap_first}(){
		return this.${po.fieldName};
	}

	/**
	 *鏂规硶: 璁剧疆${po.fieldType}
	 *@param: ${po.fieldType}  ${po.description}
	 */
	public void set${po.fieldName?cap_first}(${po.fieldType} ${po.fieldName}){
		this.${po.fieldName} = ${po.fieldName};
	}
	
	</#list>
}
