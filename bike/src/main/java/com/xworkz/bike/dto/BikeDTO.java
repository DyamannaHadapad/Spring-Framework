package com.xworkz.bike.dto;

import javax.persistence.Column;
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
@Table(name = "bike")
public class BikeDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	private String name;
	private String ownerName;
	private String location;
	private String ambassador;

	public BikeDTO(String name, String ownerName, String location, String ambassador) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.ambassador = ambassador;
	}

}
