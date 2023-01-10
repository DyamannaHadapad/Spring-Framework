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
@Table(name = "busstop")
@NamedQuery(name = "findByStateName", query = "select bus from BusStopDTO bus where bus.stateName=:sn")
public class BusStopDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	private String name;
	private String stateName;
	private String numberPlate;
	private double price;

	public BusStopDTO(String name, String stateName, String numberPlate, double price) {
		super();
		this.name = name;
		this.stateName = stateName;
		this.numberPlate = numberPlate;
		this.price = price;
	}

}
