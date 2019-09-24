package com.zhaohuiying.senior1.week3.domain;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * @ClassName: Plan 
 * @Description: 计划实体类
 * @author:赵绘樱
 * @date: 2019年9月16日 上午8:55:45
 */
public class Plan implements Serializable{
    /**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private Integer pid;

    private String pname;

    private BigDecimal amount;

    private String manager;

    private Integer deptId;

    private String content;
    private Department department;
    
    
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Plan( String pname, BigDecimal amount, String manager, Integer deptId, String content) {
		super();
		this.pname = pname;
		this.amount = amount;
		this.manager = manager;
		this.deptId = deptId;
		this.content = content;
	}

	public Plan() {
		super();
	}

	@Override
	public String toString() {
		return "Plan [pid=" + pid + ", pname=" + pname + ", amount=" + amount + ", manager=" + manager + ", deptId="
				+ deptId + ", content=" + content + "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plan other = (Plan) obj;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		return true;
	}
	
  
}