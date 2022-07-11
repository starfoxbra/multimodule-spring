package com.example.multimodule.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.multimodule.service.MyService;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")

public class DemoApplication {

	private final MyService myService;

	public DemoApplication(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/test2")
	public String home() {
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
