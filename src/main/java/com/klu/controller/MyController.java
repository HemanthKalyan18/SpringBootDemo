package com.klu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/hello")
	public String sayWelcome() {
		return "<h1>Welcome to SpringBoot WebApplication";
	}
}
