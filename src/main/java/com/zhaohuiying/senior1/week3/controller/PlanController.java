package com.zhaohuiying.senior1.week3.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhaohuiying.senior1.week3.domain.Plan;
import com.zhaohuiying.senior1.week3.service.PlanService;
import com.zhaohuiying.senior1.week3.util.PageUtil;

@Controller
public class PlanController {
	@Resource
	private PlanService planService;
	
	@RequestMapping("selects")
	private String selects(Model m, @RequestParam(defaultValue = "")String pname,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "5")Integer pageSize) {
		
		PageInfo<Plan> info = planService.selects(pname, page, pageSize);
		String page2 = PageUtil.page(page, info.getPages(), "/selects", pageSize);
		m.addAttribute("plan", info.getList());
		m.addAttribute("page", page2);
		m.addAttribute("pname", pname);
		
		return "plans";
		
	}
	
	@RequestMapping("look")
	private String look(Model m,@RequestParam(defaultValue ="")Integer pid) {
		
		Plan key = planService.selectByPrimaryKey(pid);
		System.out.println(key);
		
		
		m.addAttribute("key", key);
		return "look";
		
	}
	@ResponseBody
	@RequestMapping("delPlan")
	private Object del(Integer ids) {
		
		int deleteByPrimaryKey = planService.deleteByPrimaryKey(ids);
		
		return deleteByPrimaryKey>1;
		
	}
	
	
}
