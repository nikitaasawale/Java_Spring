package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public interface Drink {
	@Bean(name="coke")
	public void serve();
		
	

}
