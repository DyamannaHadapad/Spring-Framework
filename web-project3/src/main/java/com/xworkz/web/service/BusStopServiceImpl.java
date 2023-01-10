package com.xworkz.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.web.dto.BusStopDTO;
import com.xworkz.web.repository.BusStopRepository;

@Component
public class BusStopServiceImpl implements BusStopService {

	@Autowired
	private BusStopRepository repository;

	@Override
	public boolean validateAndSave(BusStopDTO dto) {
		System.out.println("running validateAndSave ");
		this.repository.save(dto);
		return true;
	}

	@Override
	public Optional<List<BusStopDTO>> findByStateName(String stateName) {
		System.out.println("Running findByStateName in serviceImpl...");
		this.repository.findByStateName(stateName);
		return Optional.empty();
	}

}
