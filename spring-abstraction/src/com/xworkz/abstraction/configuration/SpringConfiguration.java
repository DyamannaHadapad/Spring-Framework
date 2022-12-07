package com.xworkz.abstraction.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.abstraction.dto.SimDTO;
import com.xworkz.abstraction.service.SimService;
import com.xworkz.abstraction.service.SimServiceImpl;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	@Bean
	public SimDTO simDTO() {
		SimDTO simDTO = new SimDTO(2, 1234567, "postPaid", "Airtel");
		return simDTO;
	}

	@Bean
	public SimServiceImpl impl() {
		SimServiceImpl impl = new SimServiceImpl();
		impl.validateAndSave(null);
		return impl;

	}

}
