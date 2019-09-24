package com.zhaohuiying.senior1.week3.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhaohuiying.senior1.week3.domain.Department;

public interface DepartmentMapper {
	
	
	List<Department> selects ();
	
	
	
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}