package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.CustomerInfo;
import com.dart.carrentalplatform.mapper.CustomerInfoMapper;
import com.dart.carrentalplatform.service.CustomerInfoService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:27 PM
 */
@RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class CustomerInfoServiceImpl extends BaseServiceImpl<CustomerInfoMapper, CustomerInfo> implements CustomerInfoService {

}
