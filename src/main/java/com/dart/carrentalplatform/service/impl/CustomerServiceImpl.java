package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.Customer;
import com.dart.carrentalplatform.mapper.CustomerMapper;
import com.dart.carrentalplatform.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:27 PM
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public void addCustomer(int id, String card, String name, String phone) {
        customerMapper.addCustomer(id, card, name, phone);
    }

    @Override
    public void deleteCustomer(int id) {
        customerMapper.deleteCustomer(id);
    }

    @Override
    public void updateCustomer(int id, String card, String name, String phone) {
        customerMapper.updateCustomer(id, card, name, phone);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerMapper.getAllCustomers();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerMapper.getCustomerById(id);
    }
}
