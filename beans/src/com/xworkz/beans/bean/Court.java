package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Court {

	private String name;
	private String type;
	private int noOfCourts;
	@Autowired
	@Qualifier("location")
	private String place;
	@Autowired
	private Judge judge;

	public Court(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Value("65")
	public void setNoOfCourts(int noOfCourts) {
		this.noOfCourts = noOfCourts;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getPlace() {
		return place;
	}

	public int getNoOfCourts() {
		return noOfCourts;
	}

	public Judge getJudge() {
		return judge;
	}

	public void showAll() {
		System.out.println(judge.getAge());
		System.out.println(judge.getName());
		System.out.println(judge.getSalary());
	}

}
