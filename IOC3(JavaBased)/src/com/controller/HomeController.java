package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Employee;

public class HomeController {
	public static void main(String[] args) {
		ApplicationContext applicationcontext=new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee=applicationcontext.getBean("employe",Employee.class);
		System.out.println(employee);
		
	}

}
