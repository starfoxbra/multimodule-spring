package com.example.multimodule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AntecipationController {

	@Autowired
	private  MyService myService;



	@GetMapping("/")
	public String home() {
		return myService.message();
	}
	
}
