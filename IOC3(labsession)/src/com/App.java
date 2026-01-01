package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationcontext=new AnnotationConfigApplicationContext(App.class);
		DrinkService drinkservice=applicationcontext.getBean(DrinkService.class);
		drinkservice.orderDrink();
		
	}

}
