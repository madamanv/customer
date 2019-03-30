package com.remorides.remorides.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="customer", catalog = "remorides")
public class Customer {

    @Id
    @GeneratedValue
    private String custId;
    private String name;
    private String address;
    private String loanconsent;
    private String salary;
    private String loanref;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoanconsent() {
        return loanconsent;
    }

    public void setLoanconsent(String loanconsent) {
        this.loanconsent = loanconsent;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLoanref() {
        return loanref;
    }

    public void setLoanref(String loanref) {
        this.loanref = loanref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return custId.equals(customer.custId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId);
    }
}
