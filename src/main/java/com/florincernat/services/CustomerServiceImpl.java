package com.florincernat.services;

import com.florincernat.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void registerCustomer(Customer customer) {
        logger.info("Registering customer: "+customer.getFullName() + " with email:" + customer.getEmail());
        jdbcTemplate.update("call register_customer(?,?,?)",customer.getEmail(),customer.getFullName(),customer.getPassword());

    }

    @Override
    public void loginCustomer(String email, String password) {
        //String databaseEmail = jdbcTemplate.queryForObject("select email from customers where email='?'",email);
    }


}
