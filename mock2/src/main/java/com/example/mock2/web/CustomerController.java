package com.example.mock2.web;

import com.example.mock2.entities.Customer;
import com.example.mock2.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping(path = "/index")
    public String customers(Model model) {
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("listCustomers", customers);
        return "customers";
    }
}
