package com.jason.mapper;

import com.jason.dto.Customer;

/**
 * Created by jason on 2017/1/6.
 */
public interface CustomerMapper {
    Customer selectByName(String name);
}
