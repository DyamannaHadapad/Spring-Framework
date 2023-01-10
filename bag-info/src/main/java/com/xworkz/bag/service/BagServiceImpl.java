package com.xworkz.bag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bag.dto.BagDTO;
import com.xworkz.bag.repository.BagRepository;

@Component
public class BagServiceImpl implements BagService {
	
	@Autowired
	private BagRepository repository;

	@Override
	public boolean validateAndSave(BagDTO dto) {
		System.out.println("running validateAndSave method");
		this.repository.save(dto);
		return false;
	}

}
