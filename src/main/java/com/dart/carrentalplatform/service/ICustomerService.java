package com.dart.carrentalplatform.service;

import com.dart.carrentalplatform.entity.Customer;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:26 PM
 */
public interface ICustomerService {

    void addCustomer(int id, String card, String name, String phone);

    void deleteCustomer(int id);

    void updateCustomer(int id, String card, String name, String phone);

    List<Customer> getAllCustomers();

    Customer getCustomerById(int id);
}
