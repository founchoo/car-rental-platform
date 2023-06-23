package com.dart.carrentalplatform.mapper;

import com.dart.carrentalplatform.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:24 PM
 */
@Repository
public interface CustomerMapper {

    List<Customer> getAllCustomers();
    void addCustomer(int id, String card, String name, String phone);
    void deleteCustomer(int id);
    void updateCustomer(int id, String card, String name, String phone);
    Customer getCustomerById(int id);
}
