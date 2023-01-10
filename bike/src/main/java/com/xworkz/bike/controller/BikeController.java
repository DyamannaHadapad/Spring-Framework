package com.xworkz.bike.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bike.dto.BikeDTO;
import com.xworkz.bike.service.BikeService;

@Component
@RequestMapping("/send")
public class BikeController {

	@Autowired
	private BikeService  service;
	
	public BikeController() {
		System.out.println("Running BikeController ");
	}

	@PostMapping
	public String onSend(BikeDTO dto, HttpServletRequest request) {
		System.out.println("executing onSend method");
		System.out.println("dto" + dto);
		 boolean save = service.valdateAndSave(dto);
		if (save) {
			request.setAttribute("message", "Bike details saved successfully");
		} else {
			request.setAttribute("error", "Bike details not saved ....");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}
}
