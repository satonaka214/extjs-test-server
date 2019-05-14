package com.satonaka.extjstestserver.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @GetMapping("customers")
    public List<Customer> getCustomers() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("1", "Alice"));
        customerList.add(new Customer("2", "Bob"));
        customerList.add(new Customer("3", "Charlie"));

        return customerList;
    }
}
