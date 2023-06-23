package com.dart.carrentalplatform.service;

import com.dart.carrentalplatform.entity.Customer;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:26 PM
 */
public interface CustomerService {

    public void addCustomer(int id, String card, String name, String phone);

    public void deleteCustomer(int id);

    public void updateCustomer(int id, String card, String name, String phone);

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(int id);
}
