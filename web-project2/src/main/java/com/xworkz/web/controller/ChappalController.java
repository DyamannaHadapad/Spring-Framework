package com.xworkz.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.web.dto.ChappalDTO;
import com.xworkz.web.service.ChappalService;

@Component
@RequestMapping("/save")
public class ChappalController {
	
	@Autowired
	private ChappalService service;

	public ChappalController() {
		System.out.println("Running defult constr of ChappalController");
	}

	@PostMapping
	public String onSend(ChappalDTO dto, HttpServletRequest request) {
		System.out.println("Executing onSend method");
		
		boolean save = service.validateAndSave(dto);
		if (save) {
			request.setAttribute("message", "Information of chappal saved successfully");
			System.out.println("All Data  :"+dto);
		} else {
			request.setAttribute("error", "Information of chappal not saved");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}
}
