package com.zhaohuiying.senior1.week3.service;

import java.util.List;

import com.zhaohuiying.senior1.week3.domain.Department;

public interface DepartmentService {
	List<Department> selects ();
	
	
	

    Department selectByPrimaryKey(Integer id);

}
