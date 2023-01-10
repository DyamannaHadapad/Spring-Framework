package com.xworkz.temple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.service.TempleService;

@Component
@RequestMapping("/save")
public class TempleController {
	
	@Autowired
	private TempleService service;

	public TempleController() {
		System.out.println("defult constr of TemplController");
	}

	@PostMapping
	public String onSave(TempleDTO dto, HttpServletRequest request) {
		System.out.println("executing onSave method");
		System.out.println("All Data  :" + dto);
		boolean save = service.validateAndSave(dto);
		if (save) {
			request.setAttribute("message", "Details saved successfully...");
		} else {
			request.setAttribute("error", "Details is not saved...");
			request.setAttribute("dto", dto);
		}
		return "index";
	}
	
	
}
