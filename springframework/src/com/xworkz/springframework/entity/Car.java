package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public Car() {
		System.out.println("running defult constr");
	}

	public void transport() {
		System.out.println("running transport method");
	}

}
