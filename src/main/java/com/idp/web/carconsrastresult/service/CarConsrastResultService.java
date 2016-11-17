package com.idp.web.carconsrastresult.service;
import com.idp.web.carconsrastresult.entity.CarConsrastResult;
import java.util.List;

import com.idp.common.persistence.Page;

/**
 * 
 * 车辆对比结果管理service鎺ュ彛
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
public interface CarConsrastResultService{
	
 	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	鍒嗛〉鏌ヨ
	 * </pre>
	 * 
	 * @param carConsrastResult
	 * @param page
	 * @return
	 */
	public Page<CarConsrastResult> findByPage(CarConsrastResult carConsrastResult,Page<CarConsrastResult> page);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	鏌ヨ
	 * </pre>
	 * 
	 * @param carConsrastResult
	 * @return
	 */
	public List<CarConsrastResult> findBySearch(CarConsrastResult carConsrastResult);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	閫氳繃ID鏌ヨ
	 * </pre>
	 * 
	 * @param CarConsrastResult
	 * @return
	 */
	public CarConsrastResult getById(Long id);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	鏂板
	 * </pre>
	 * 
	 * @param carConsrastResult
	 */
	public void add(CarConsrastResult carConsrastResult);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	淇敼
	 * </pre>
	 * 
	 * @param carConsrastResult
	 */
	public void update(CarConsrastResult carConsrastResult);
	
	/**
	 * 
	 * <pre>
	 * 	2016-09-27 14:01 yhg
	 * 	鍒犻櫎
	 * </pre>
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
