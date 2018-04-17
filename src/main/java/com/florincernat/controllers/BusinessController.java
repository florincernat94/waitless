package com.florincernat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {
	
	@GetMapping("/register_customer")
	public String greeting() {
		return "register_customer";
	}
}
