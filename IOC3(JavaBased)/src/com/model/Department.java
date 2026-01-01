package com.model;

public class Department {
	private int did;
	private String deptname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", deptname=" + deptname + "]";
	}
	

}
