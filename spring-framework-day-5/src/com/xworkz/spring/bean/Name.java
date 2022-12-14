package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.spring.bean.enumclasses.Type;

import lombok.Data;

@Data
@Component
public class Name {

	private String firstName;
	private String middleName;
	private String lastName;
	@Autowired
	private Type type;

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", type="
				+ type + "]";
	}

}
