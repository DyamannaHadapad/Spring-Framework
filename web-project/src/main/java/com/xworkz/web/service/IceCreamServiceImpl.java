package com.xworkz.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.web.dto.IceCreamDTO;
import com.xworkz.web.reposiory.IceCreamRepository;

@Component
public class IceCreamServiceImpl implements IceCreamService {

	@Autowired
	private IceCreamRepository repository;

	@Override
	public boolean vaalidateAndSave(IceCreamDTO dto) {
		System.out.println("running vaalidate and save method...");
		this.repository.save(dto);
		return true;
	}

	@Override
	public Optional<List<IceCreamDTO>> findByBrand(String brand) {
		System.out.println("running findByBrand in serviceImpl");
		this.repository.findByBrand(brand);
		return IceCreamService.super.findByBrand(brand);
	}

}
