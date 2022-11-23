package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class Company {

	public Company() {
		System.out.println("running defult constr");
	}

	public void doWork() {
		System.out.println("running work method");
	}
}
