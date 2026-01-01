package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int eid;
	private String ename;
	@Autowired
	private Department department;
	@Autowired
	private Department dept1;
	@Autowired
	private Department dept2;
	
	public Department getDept1() {
		return dept1;
	}
	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}
	public Department getDept2() {
		return dept2;
	}
	public void setDept2(Department dept2) {
		this.dept2 = dept2;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + ", dept1=" + dept1
				+ ", dept2=" + dept2 + "]";
	}
	

}
