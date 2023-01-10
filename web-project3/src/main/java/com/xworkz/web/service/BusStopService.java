package com.xworkz.web.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.web.dto.BusStopDTO;

public interface BusStopService {
	
	boolean validateAndSave(BusStopDTO dto);
	
	Optional<List<BusStopDTO>> findByStateName(String stateName);

}
