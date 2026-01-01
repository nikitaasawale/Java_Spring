package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.model.Department;
import com.model.Employee;

@Configuration
public class AppConfig {
	@Bean(name="employe")
	@Scope(value="prototype")
	public Employee getEmployee() {
		Employee employe=new Employee();
		employe.setEid(101);
		employe.setEname("Ravi");
		//employe.setDepartment(getDepartment());
		return employe;
	}
	@Bean(name="department")
	public Department getDepartment() {
		Department dept=new Department();
		dept.setDid(1000);
		dept.setDeptname("SALES");
		return dept;
	}
	@Bean(name="dept1")
	public Department getDepartment1() {
		Department dept1=new Department();
		dept1.setDid(1002);
		dept1.setDeptname("HR");
		return dept1;
	}
	@Bean(name="dept2")
	public Department getDepartment2() {
		Department dept2=new Department();
		dept2.setDid(1003);
		dept2.setDeptname("Marketing");
		return dept2;
	}

}
