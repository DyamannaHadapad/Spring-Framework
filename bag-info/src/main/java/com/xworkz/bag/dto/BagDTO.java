package com.xworkz.bag.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "baginfo")
public class BagDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String brand;
	private	String color;
	private	double price;
	private	double quantity;

	public BagDTO(String brand, String color, double price, double quantity) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}

}
