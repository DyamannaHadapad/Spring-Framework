package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UnionTerritories {
	@Autowired
	private Lakshadweep lakshadeep;

	@Override
	public String toString() {
		return "UnionTerritories [lakshadeep=" + lakshadeep + "]";
	}

}
