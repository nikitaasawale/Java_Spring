package com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pepsi")
@Primary
public class Pepsi implements Drink{

	@Override
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("Pepsi is served");
		
	}

}
