package com.xworkz.abstraction.service;

import com.xworkz.abstraction.dto.SimDTO;
import com.xworkz.abstraction.repository.SimRepository;

public class SimServiceImpl implements SimService {

	private SimRepository repository;

	@Override
	public boolean validateAndSave(SimDTO dto) {
		System.out.println("Running save method in " + getClass());
		this.repository.save(dto);
		return true;
	}

}
