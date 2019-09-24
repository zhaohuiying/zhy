package com.zhaohuiying.senior1.week3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaohuiying.senior1.week3.dao.PlanMapper;
import com.zhaohuiying.senior1.week3.domain.Plan;
@Service
public class PlanServiceimpl implements com.zhaohuiying.senior1.week3.service.PlanService {
	@Resource
	private PlanMapper planMapper;
	@Override
	public int insertSelective(Plan record) {
		// TODO Auto-generated method stub
		return planMapper.insertSelective(record);
	}
	@Override
	public PageInfo<Plan> selects(String pname, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Plan> list = planMapper.selects(pname);
		return new PageInfo<Plan>(list);
	}
	@Override
	public int deleteByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return planMapper.deleteByPrimaryKey(pid);
	}
	@Override
	public Plan selectByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return planMapper.selectByPrimaryKey(pid);
	}
	@Override
	public int updateByPrimaryKeyWithBLOBs(Plan record) {
		// TODO Auto-generated method stub
		return planMapper.updateByPrimaryKeyWithBLOBs(record);
	}

}
