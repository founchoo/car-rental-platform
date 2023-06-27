package com.dart.carrentalplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dart.carrentalplatform.entity.Order;
import com.dart.carrentalplatform.mapper.OrderMapper;
import com.dart.carrentalplatform.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:33 PM
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
