package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class Bottel {

	public Bottel() {
		System.out.println("running defult constr");
	}

	public void drink() {
		System.out.println("running drink method");
	}

}
