package com.remorides.remorides.service;

import com.remorides.remorides.model.Customer;
import com.remorides.remorides.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getByCustomerId(String custId) {
        return customerRepository.findByCustId(custId);
    }
}
