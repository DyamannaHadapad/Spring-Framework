package com.xworkz.bike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bike.dto.BikeDTO;
import com.xworkz.bike.repository.BikeRepository;

@Component
public class BikeServiceImpl implements BikeService {

	@Autowired
	private BikeRepository repository;

	@Override
	public boolean valdateAndSave(BikeDTO dto) {
		System.out.println("Running validate and save method");
		this.repository.save(dto);
		return true;
	}

}
