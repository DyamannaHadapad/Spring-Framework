package com.xworkz.springframework.entity;

import org.springframework.stereotype.Component;

@Component
public class IronBox {

	public IronBox() {
		System.out.println("running defult constr");
	}

	public void ironClothes() {
		System.out.println("running ironClothes method");
	}

}
