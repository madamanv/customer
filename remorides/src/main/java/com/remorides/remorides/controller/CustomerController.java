package com.remorides.remorides.controller;

import com.remorides.remorides.model.Customer;
import com.remorides.remorides.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/customer/v1")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(path="/get/{custId}")
    public List<Customer> getCustomerDetails(@PathVariable("custId") String custId) {
        return customerService.getByCustomerId(custId);
    }
}
