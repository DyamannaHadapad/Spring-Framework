package com.xworkz.spring.bean;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Component
public class VicePresident extends President {
	@Autowired
	@Qualifier("VicePresidentName")
	private Name name;
	@Value("65")
	private int age;
	@Autowired
	@Qualifier("VicePresidentSalary")
	private Salary salary;
	@Value("dont know")
	private String expertise;
	@Autowired
	@Qualifier("VicePresidentEducation")
	private Education education;

	public VicePresident() {

		System.out.println(getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "VicePresident [toString()=" + super.toString() + "]";
	}

}
