package com;

import org.springframework.stereotype.Component;

@Component("coke")
public class Coke implements Drink{

	@Override
	public void serve() {
		// TODO Auto-generated method stub
		System.out.println("Coke is served");
		
	}
	

}
