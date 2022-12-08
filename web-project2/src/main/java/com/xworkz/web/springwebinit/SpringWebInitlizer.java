package com.xworkz.web.springwebinit;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.web.configuration.SpringConfiguration;

public class SpringWebInitlizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("runing getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("runing getServletConfigClasses");
		return new Class[] { SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("runing getServletMappings");
		return null;
	}

}
