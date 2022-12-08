package com.xworkz.web.springwebinit;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.web.springconfiguration.SpringConfiguration;

@Component
public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		return new Class[] { SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		return null;
	}

}
