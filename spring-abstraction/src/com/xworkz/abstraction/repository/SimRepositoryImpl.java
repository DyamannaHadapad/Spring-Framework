package com.xworkz.abstraction.repository;

import com.xworkz.abstraction.dto.SimDTO;

public class SimRepositoryImpl implements SimRepository {

	@Override
	public boolean save(SimDTO dto) {
		System.out.println("Running Save method" + getClass());
		return true;
	}

}
