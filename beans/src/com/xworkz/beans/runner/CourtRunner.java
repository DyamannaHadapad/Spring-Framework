package com.xworkz.beans.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.bean.Court;
import com.xworkz.beans.bean.Judge;
import com.xworkz.beans.configuration.SpringConfiguration;

public class CourtRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		Court bean = context.getBean(Court.class);
		System.out.println(bean.getName());
		System.out.println(bean.getNoOfCourts());
		System.out.println(bean.getPlace());
		System.out.println(bean.getType());
		System.out.println(bean.getJudge());
		bean.showAll();

	}

}
