package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.bean.*;
import com.xworkz.spring.bean.Salary;
import com.xworkz.spring.bean.enumclasses.Type;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration {

	@Bean
	public Type type() {
		return Type.PERSON;
	}

	@Bean
	public Name presidentName() {
		Name name = new Name();
		name.setFirstName("Droupadi");
		name.setLastName("");
		name.setMiddleName("murmu");
		return name;
	}	
	@Bean
	public Name primeMinisterName() {
		Name name = new Name();
		name.setFirstName("Narendra");
		name.setLastName("D");
		name.setMiddleName("Modi");
		return name;
	}
	

	@Bean
	public Name VicePresidentName() {
		Name name = new Name();
		name.setFirstName("Ramnath");
		name.setLastName("f");
		name.setMiddleName("Kovind");
		return name;
	}
	
	@Bean
	public Salary presidentSalary() {
		Salary salary = new Salary(50000, 432000, 5000, 4000, 4500, 1500, 2000, 3500);
		return salary;
	}
	
	@Bean
	public Salary primeMinisterSalary() {
		Salary salary = new Salary(50000, 432000, 5000, 4000, 4500, 1500, 2000, 3500);
		return salary;
	}
	
	@Bean
	public State primeMinisterState() {
		State state = new State("Gujarat", 500000, "Ahmadabad", 25, 226251, "amit shah", "gujarati");
		return state;
	}
	
	@Bean
	public Education presidentEducation() {
		Education education = new Education(115, "VTU", "mechanical", 1990, "ahmedabad", 5, 75.29, true);
		return education;
	}
	
	@Bean
	public Education primeMinisterEducation() {
		Education education = new Education(254, "Reva", "chemical", 1992, "ahmedabad", 5, 65.29, true);
		return education;
	}
	
	@Bean
	public Salary VicePresidentSalary() {
		Salary salary = new Salary(1.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0);
		return salary;
	}
	
	@Bean
	public Education VicePresidentEducation() {
		Education education = new Education(115, "VTU", "mechanical", 1990, "ahmedabad", 5, 75.29, true);
		return education;
	}
	

}
