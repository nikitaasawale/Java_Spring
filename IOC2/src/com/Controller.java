package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=applicationcontext.getBean("emp",Employee.class);
		System.out.println(employee);
	}

}
