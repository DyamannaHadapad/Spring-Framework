package com.xworkz.web.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "icecream")
@NamedQuery(name = "findByBrand", query = "select ice from IceCreamDTO ice where ice.brand=:bd")
public class IceCreamDTO {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column
	private int id;
	private String type;
	private String brand;
	private String flauor;
	private double price;
	private int quantity;

	public IceCreamDTO(String type, String brand, String flauor, double price, int quantity) {
		super();
		this.type = type;
		this.brand = brand;
		this.flauor = flauor;
		this.price = price;
		this.quantity = quantity;
	}

}
