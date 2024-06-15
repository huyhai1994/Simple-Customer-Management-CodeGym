package vn.codegym.service;

import vn.codegym.model.Customer;

import java.util.List;

public interface SimpleCustomerServiceInterface {
    List<Customer> findAll();
}
