package com;

public class Employee {
	private int eid;
	private String ename;
	private String eaddress;
	private int eage;
	private Company company;

	
	
public Employee(int eid, String ename, String eaddress, int eage, Company company) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.eage = eage;
		this.company = company;
	}



//	public int getEid() {
//		return eid;
//	}
//	public Company getCompany() {
//		return company;
//	}
//	public void setCompany(Company company) {
//		this.company = company;
//	}
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public String getEaddress() {
//		return eaddress;
//	}
//	public void setEaddress(String eaddress) {
//		this.eaddress = eaddress;
//	}
//	public int getEage() {
//		return eage;
//	}
//	public void setEage(int eage) {
//		this.eage = eage;
//	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", eage=" + eage + ", company="
				+ company + "]";
	}
	

}
