package com.remorides.remorides.repository;


import com.remorides.remorides.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

    public List<Customer> findByCustId(String custId);

}
