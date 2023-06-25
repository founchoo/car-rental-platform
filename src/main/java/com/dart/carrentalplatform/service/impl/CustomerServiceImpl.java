package com.dart.carrentalplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dart.carrentalplatform.entity.Customer;
import com.dart.carrentalplatform.mapper.CustomerMapper;
import com.dart.carrentalplatform.service.CustomerService;
import org.springframework.stereotype.Service;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:27 PM
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
