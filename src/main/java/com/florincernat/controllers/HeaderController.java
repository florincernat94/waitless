package com.florincernat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeaderController {
	
	@GetMapping("/")
	public String index(){
		return "index";
	}
	
	@GetMapping("/register")
	public String greeting() {
		return "index";
	}
}
