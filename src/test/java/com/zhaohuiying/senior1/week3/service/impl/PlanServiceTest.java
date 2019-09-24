package com.zhaohuiying.senior1.week3.service.impl;



import java.io.File;

import javax.annotation.Resource;

import org.junit.Test;

import com.zhaohuiying.common.StreamUtils;
import com.zhaohuiying.senior1.week3.service.PlanService;

public class PlanServiceTest extends JunitParent{
	@Resource
	private PlanService planService;
	@Test
	public void testInsertSelective() {
		String string = StreamUtils.readTextFile(new File("F:\\workspace\\1075F_CMS\\zhaohuiying-senior1-week3\\src\\main\\resources\\text.txt"));
		String[] split = string.split("\\||");
		for (String string2 : split) {
			System.out.println(string2);
//			planService.insertSelective(new Plan(string2, amount, manager, deptId, content));
		}
	
	}

}
