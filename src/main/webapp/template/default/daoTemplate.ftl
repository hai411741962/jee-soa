<#if packageStyle == "service">
package ${sourceBasePackage}.${entityPackage}.dao;
import ${sourceBasePackage}.${entityPackage}.entity.${className};
<#else>
package ${sourceBasePackage}.dao.${entityPackage};
import ${sourceBasePackage}.entity.${entityPackage}.${className};
</#if>
import com.idp.common.base.BaseDao;

/**
 * 
 * ${description}dao鎺ュ彛.
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
public interface ${className}Dao extends BaseDao<${className}, ${pkType}> {


}