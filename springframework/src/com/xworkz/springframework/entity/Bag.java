package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class Bag {

	public Bag() {
		System.out.println("running defult constr");
	}

	public void carringMeteril() {
		System.out.println("running carringMeterial method");
	}

}
