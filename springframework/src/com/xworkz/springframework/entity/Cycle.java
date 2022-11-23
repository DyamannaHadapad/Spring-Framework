package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class Cycle {

	public Cycle() {
		System.out.println("running defult constr");
	}

	public void transport() {
		System.out.println("running transport method");
	}

}
