package com.xworkz.temple.dto;

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
@Table(name = "temple")
@NamedQuery(name = "findByGod", query = "select temple from TempleDTO temple where temple.god=:md")
public class TempleDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
	private String god;
	private int pincode;
	private double fees;
	private double openTime;
	private double closeTime;

	public TempleDTO(String name, String location, String god, int pincode, double fees, double openTime,
			double closeTime) {
		super();
		this.name = name;
		this.location = location;
		this.god = god;
		this.pincode = pincode;
		this.fees = fees;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

}
