package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class Helmet {

	public Helmet() {
		System.out.println("running defult constr");
	}

	public void protection() {
		System.out.println("running protection method");
	}

}
