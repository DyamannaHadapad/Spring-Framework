package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class SlipperEntity {

	public SlipperEntity() {
		System.out.println("Defult constr of slipperEntity");
	}

	public void protect() {
		System.out.println("Slipper du method");
	}

}
