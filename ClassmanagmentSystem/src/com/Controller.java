package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=applicationcontext.getBean("student", Student.class);
		System.out.println(s1);
	}

}
