package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class Food {

	public Food() {
		System.out.println("running defult constr");
	}

	public void energy() {
		System.out.println("Running energy method");
	}

}
