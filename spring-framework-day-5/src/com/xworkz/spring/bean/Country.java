package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {
	@Value("India")
	private String name;
	@Autowired
	private President president;
	@Autowired
	private VicePresident vicePresident;
	@Autowired
	private PrimeMinister primeMinister;
	@Value("1300000")
	private int armySize;
	@Value("Republic")
	private String type;
	@Value("31")
	private int states;
	@Autowired
	private UnionTerritories unionTerritories;
	@Autowired
	private CapitalCity capitalCity;

	@Override
	public String toString() {
		return "Country [name=" + name + ", president=" + president + ", vicePresident=" + vicePresident
				+ ", primeMinister=" + primeMinister + ", armySize=" + armySize + ", type=" + type + ", states="
				+ states + ", unionTerritory=" + unionTerritories + ", capitalCity=" + capitalCity + "]";
	}

}
