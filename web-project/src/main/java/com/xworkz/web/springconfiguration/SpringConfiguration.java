package com.xworkz.web.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("defult constr of SpringConfiguration");
	}

}
