package com.zhaohuiying.senior1.week3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhaohuiying.senior1.week3.dao.DepartmentMapper;
import com.zhaohuiying.senior1.week3.domain.Department;
import com.zhaohuiying.senior1.week3.service.DepartmentService;
@Service
public class DepartMentimpl implements DepartmentService{
	@Resource
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> selects() {
		// TODO Auto-generated method stub
		return departmentMapper.selects();
	}

	@Override
	public Department selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return departmentMapper.selectByPrimaryKey(id);
	}
	
	
}
