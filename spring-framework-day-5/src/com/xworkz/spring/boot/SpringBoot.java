package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.beans.introspect.PropertyInfo.Name;
import com.xworkz.spring.bean.Country;
import com.xworkz.spring.configuration.SpringConfiguration;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		int beanDefinitionCount = context.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);

		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);

		}
		Country bean = context.getBean(Country.class);
		System.out.println(bean);

	}

}
