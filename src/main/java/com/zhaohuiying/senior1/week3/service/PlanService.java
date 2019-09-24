package com.zhaohuiying.senior1.week3.service;



import com.github.pagehelper.PageInfo;
import com.zhaohuiying.senior1.week3.domain.Plan;
/**
 * 
 * @ClassName: PlanService 
 * @Description: 计划
 * @author:赵绘樱
 * @date: 2019年9月16日 上午9:04:27
 */
public interface PlanService {
	/**
	 * 
	 * @Title: insertSelective 
	 * @Description: 添加信息
	 * @param record
	 * @return
	 * @return: int
	 */
	int insertSelective(Plan record);
	
	PageInfo<Plan> selects (String pname,Integer page,Integer pageSize);
	
	 int deleteByPrimaryKey(Integer pid);

	 Plan selectByPrimaryKey(Integer pid);

	 int updateByPrimaryKeyWithBLOBs(Plan record);
}
