package com.xworkz.web.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.web.dto.IceCreamDTO;

public interface IceCreamService {

	boolean vaalidateAndSave(IceCreamDTO dto);

	default Optional<List<IceCreamDTO>> findByBrand(String brand) {
		return Optional.empty();
	}

}
