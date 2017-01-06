package com.jason.controller;

import com.jason.dto.Customer;
import com.jason.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jason on 2017/1/6.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/loginFilm")
    public String loginFilm(String firstName) {
        Customer customer = customerService.selectByName(firstName);
        String message = "";
        if(customer != null) {
            message = "/show.html";
        }
        if(customer == null) {
            message = "/login.html";
        }
        return message;
    }
}
