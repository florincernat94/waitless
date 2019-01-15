package com.florincernat.services;

import com.florincernat.dto.Customer;


public interface CustomerService {
    void registerCustomer(Customer customer);
    void loginCustomer(String email, String password);

}
