package com.jason.service;

import com.jason.dto.Customer;

/**
 * Created by jason on 2017/1/6.
 */
public interface CustomerService {
    Customer selectByName(String name);
}
