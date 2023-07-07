package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.Order;
import com.dart.carrentalplatform.mapper.OrderMapper;
import com.dart.carrentalplatform.service.OrderService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:33 PM
 */
@RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, Order> implements OrderService {

}
