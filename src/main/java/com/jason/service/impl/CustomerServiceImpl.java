package com.jason.service.impl;

import com.jason.dto.Customer;
import com.jason.mapper.CustomerMapper;
import com.jason.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jason on 2017/1/6.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer selectByName(String name) {
        return customerMapper.selectByName(name);
    }
}
