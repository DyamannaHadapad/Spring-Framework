package com.xworkz.web.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.web.dto.BusStopDTO;

public interface BusStopRepository {

	boolean save(BusStopDTO dto);

	Optional<List<BusStopDTO>> findByStateName(String stateName);

}
