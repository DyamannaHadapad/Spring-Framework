package com.xworkz.web.reposiory;

import java.util.List;
import java.util.Optional;

import com.xworkz.web.dto.IceCreamDTO;

public interface IceCreamRepository {
	
	boolean save(IceCreamDTO dto);

	default Optional<List<IceCreamDTO>> findByBrand(String brand) {
		return Optional.empty();
	}
}
