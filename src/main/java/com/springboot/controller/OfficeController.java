package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Office;
import com.springboot.services.OfficeService;

@RestController
@RequestMapping("/office")
public class OfficeController {
	@Autowired
	private OfficeService service;
	
	@GetMapping("/officeList")
	public List<Office> getAllOffice(){
		return service.findAllOffice();
	}
	@PostMapping("/createOffice")
	public Office createOffice(@RequestBody Office office) {
		return service.createOffice(office);
	}
	@GetMapping("/{id}")
	public Office findByOfficeId(@PathVariable("id")Long id) {
		return service.findByOfficeId(id);
	}
}
