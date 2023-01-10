package com.xworkz.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.web.dto.ChappalDTO;
import com.xworkz.web.repository.ChappalRepository;

@Component
public class ChappalServiceImpl implements ChappalService {

	@Autowired
	private ChappalRepository repository;
	
	@Override
	public boolean validateAndSave(ChappalDTO dto) {
		System.out.println("runing validateAndSave in ChappalServiceImpl");
		this.repository.save(dto);
		return true;
	}

}
