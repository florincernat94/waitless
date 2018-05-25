package com.florincernat.controllers;

import com.florincernat.dto.Customer;
import com.florincernat.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

	@PostMapping("/register")
    @ResponseBody
	public String registerCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.registerCustomer(customer);
        return "Thanks for registering!";
    }
}
