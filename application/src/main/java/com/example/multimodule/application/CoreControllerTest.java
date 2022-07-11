package com.example.multimodule.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multimodule.service.MyService;

@RestController
public class CoreControllerTest {

	@Autowired
	private  MyService myService;



	@GetMapping("/test5")
	public String home() {
		return myService.message();
	}
}
