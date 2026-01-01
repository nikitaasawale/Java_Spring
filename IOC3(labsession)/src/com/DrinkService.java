package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DrinkService {
	@Autowired
	@Qualifier("pepsi")
	public Drink drink;
	public void orderDrink() {
		drink.serve();
		System.out.println("Ordered Successfully!!");
	}

}
