package com.xworkz.bag.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bag.dto.BagDTO;
import com.xworkz.bag.service.BagService;

@Component
@RequestMapping("/send")
public class BagController {

	@Autowired
	private BagService service;

	public BagController() {
		System.out.println("BagController");
	}

	@PostMapping
	public String onSend(BagDTO dto, HttpServletRequest request) {
		System.out.println("running onsend method in BagController");
		System.out.println("All data  :" + dto);
		boolean save = this.service.validateAndSave(dto);
		if (save) {
			request.setAttribute("message", "Data saved successfully");
		} else {
			request.setAttribute("error", "Data not saved successfully");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
