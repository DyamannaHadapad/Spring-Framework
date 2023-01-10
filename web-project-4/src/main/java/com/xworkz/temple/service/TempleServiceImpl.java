package com.xworkz.temple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleReposiory;

@Component
public class TempleServiceImpl implements TempleService {

	@Autowired
	private TempleReposiory repository;

	@Override
	public boolean validateAndSave(TempleDTO dto) {
		System.out.println("running validateAndSave...");
		this.repository.save(dto);
		return true;
	}

}
