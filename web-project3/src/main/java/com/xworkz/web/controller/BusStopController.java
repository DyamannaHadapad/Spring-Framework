package com.xworkz.web.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.web.dto.BusStopDTO;
import com.xworkz.web.service.BusStopService;

@Component
@RequestMapping("/save")
public class BusStopController {

	@Autowired
	private BusStopService service;

	public BusStopController() {
		System.out.println("defult constr of busStopController");
	}

	@PostMapping
	public String onSave(BusStopDTO dto, HttpServletRequest request) {
		System.out.println("executing onSave method");
		System.out.println("All daata  :" + dto);
		boolean save = service.validateAndSave(dto);
		if (save) {
			request.setAttribute("message", "Detais are saved successfully...");
		} else {
			request.setAttribute("error", "Detais are not saved...");
			request.setAttribute("dto", dto);
		}
		return "index";
	}

	@GetMapping
	public String findByStateName(@RequestParam String stateName, Model model) {
		Optional<List<BusStopDTO>> findByStateName = this.service.findByStateName(stateName);

		if (findByStateName.isPresent() && findByStateName.get().size() > 0) {
			System.out.println("Data is present...");
			List<BusStopDTO> list = findByStateName.get();
			System.out.println("List is present..." + list.size());
			model.addAttribute("list", list);
			return "searchResult";
		} else {
			System.out.println("Data is not present .." + stateName);
			model.addAttribute("error", "No Results Found");
			return "search";
		}
	}
}
