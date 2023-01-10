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

import com.xworkz.web.dto.IceCreamDTO;
import com.xworkz.web.service.IceCreamService;


@Component
@RequestMapping("/send")
public class IceCreamController {

	@Autowired
	private IceCreamService service;

	public IceCreamController() {
		System.out.println("IcecreamController");
	}

	@PostMapping
	public String onSend(IceCreamDTO dto, HttpServletRequest request) {
		System.out.println("executing onSend method");
		System.out.println("dto" + dto);
		boolean save = service.vaalidateAndSave(dto);
		if (save) {
			request.setAttribute("message", "IceCream details saved successfully");
		} else {
			request.setAttribute("error", "IceCream details not saved ....");
			request.setAttribute("dto", dto);
		}
		return "index";
	}

	@GetMapping
	public String findByBrand(@RequestParam String brand, Model model) {
		System.out.println("Brand selected from UI..." + brand);

		Optional<List<IceCreamDTO>> findByBrand = this.service.findByBrand(brand);
		if (findByBrand.isPresent() && findByBrand.get().size() > 0) {
			System.out.println("Data is present...");
			List<IceCreamDTO> list = findByBrand.get();
			System.out.println("Total list is found.." + list.size());
			model.addAttribute("list", list);
			return "searchResult";
		}

		System.out.println("Data is not present for  " + brand);
		model.addAttribute("error", "No Results Found");
		return "search";
	}

}
