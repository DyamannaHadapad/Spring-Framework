package com.xworkz.temple.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.temple.dto.TempleDTO;

public interface TempleReposiory {
	
	boolean save(TempleDTO dto);
	
	default Optional<List<TempleDTO>> findByGod(String god){
		return Optional.empty();
	}

}
