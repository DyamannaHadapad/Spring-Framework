package com.xworkz.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.bean.Court;
@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("SpringConfiguration defult constr");
	}

	@Bean
	public String location() {
		return "Dharwad High Court";
	}

	public Court court() {
		Court court = new Court("DharwadHighCourt", "High court");
		court.setNoOfCourts(25);
		return court;
	}

}
