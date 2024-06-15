package vn.codegym.service.impl;

import vn.codegym.model.Customer;
import vn.codegym.service.SimpleCustomerServiceInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleCustomerServiceImpl implements SimpleCustomerServiceInterface {
    public static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Nguyen Khac Nhat", "nhat@Codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Da Nang"));
        customers.put(3, new Customer(3, "Le Thi Chau", "chau.le@codegym.vn", "Ha Noi"));
        customers.put(4, new Customer(4, "Nguyen Thuy Duong", "duong.nguyen@codegym.vn", "Sai Gon"));
        customers.put(5, new Customer(5, "CodeGym", "CodeGym@gmail.com.vn", "VietNam"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList <>(customers.values());
    }
}
