package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HomeController {
	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("beans.xml");
//		BeanFactory beanfactory=new XmlBeanFactory(resource);
//		Student student=beanfactory.getBean("st", Student.class);
		System.out.println("Success!!!!!!!!!!!");
		ApplicationContext appicationcontext=new ClassPathXmlApplicationContext("beans.xml");
		
	}

}
