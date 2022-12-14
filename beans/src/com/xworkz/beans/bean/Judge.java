package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Judge {

	@Autowired
	private String name;
	@Value("55")
	private int age;
	private double salary;

	public Judge(@Value("Dyamanna H") String name) {
		this.name = name;
		System.out.println("parameterised constr of judge");
	}

	@Value("30")
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

}
