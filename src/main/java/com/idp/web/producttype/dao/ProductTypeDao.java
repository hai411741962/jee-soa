package com.idp.web.producttype.dao;
import java.util.List;

import com.idp.common.base.BaseDao;
import com.idp.web.producttype.entity.ProductType;

/**
 * 
 * 产品类型管理dao接口.
 * 
 * <pre>
 * 	历史记录：
 * 	2016-09-07 14:44 yhg
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
public interface ProductTypeDao extends BaseDao<ProductType, Long> {

	List<ProductType> findProductTypeTree(Long parentId);


}