package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.dto.SimDTO;
import com.xworkz.abstraction.repository.SimRepository;
import com.xworkz.abstraction.repository.SimRepositoryImpl;
import com.xworkz.abstraction.service.SimService;
import com.xworkz.abstraction.service.SimServiceImpl;

public class SimRunner {
	public static void main(String[] args) {

		SimDTO dto = new SimDTO(2, 1234567, "postPaid", "Airtel");

		SimRepository repository = new SimRepositoryImpl();

		SimService service = new SimServiceImpl();
		boolean validateAndSave = service.validateAndSave(dto);
		System.out.println(validateAndSave);
	}

}
