package com.idp.web.producttype.service;
import java.util.List;

import com.idp.common.persistence.Page;
import com.idp.web.producttype.entity.ProductType;

/**
 * 
 * 产品类型管理service接口
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
public interface ProductTypeService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	分页查询
	 * </pre>
	 * 
	 * @param productType
	 * @param page
	 * @return
	 */
	public Page<ProductType> findByPage(ProductType productType,Page<ProductType> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	查询
	 * </pre>
	 * 
	 * @param productType
	 * @return
	 */
	public List<ProductType> findBySearch(ProductType productType);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	通过ID查询
	 * </pre>
	 * 
	 * @param ProductType
	 * @return
	 */
	public ProductType getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	新增
	 * </pre>
	 * 
	 * @param productType
	 */
	public void add(ProductType productType);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	修改
	 * </pre>
	 * 
	 * @param productType
	 */
	public void update(ProductType productType);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-07 14:44 yhg
	 * 	删除
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
	
	/**
	 * 根据父级id查询类型列表
	 * @param parentId
	 * @return
	 */
	public List<ProductType> findForTreeTable(Long parentId);

	public List<ProductType> find(ProductType productType);
}
