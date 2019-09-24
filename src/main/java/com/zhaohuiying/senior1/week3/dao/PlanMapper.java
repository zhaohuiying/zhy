package com.zhaohuiying.senior1.week3.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhaohuiying.senior1.week3.domain.Plan;

public interface PlanMapper {
	
	List<Plan> selects (@Param("pname")String pname);
	
	 
    int deleteByPrimaryKey(Integer pid);

    int insert(Plan record);

    int insertSelective(Plan record);

    Plan selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Plan record);

    int updateByPrimaryKeyWithBLOBs(Plan record);

    int updateByPrimaryKey(Plan record);
}