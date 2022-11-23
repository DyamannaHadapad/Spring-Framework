package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class Bed {

	public Bed() {
		System.out.println("running defult constr");
	}

	public void sleep() {
		System.out.println("running sleep method");
	}

}
