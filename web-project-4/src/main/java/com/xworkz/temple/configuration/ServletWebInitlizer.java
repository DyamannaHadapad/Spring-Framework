package com.xworkz.temple.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletWebInitlizer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] { SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}