package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.TrafficViolationAccident;
import com.dart.carrentalplatform.mapper.TrafficViolationAccidentMapper;
import com.dart.carrentalplatform.service.TrafficViolationAccidentService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 6/30/2023
 */
@RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class TrafficViolationAccidentServiceImpl extends BaseServiceImpl<TrafficViolationAccidentMapper, TrafficViolationAccident>
        implements TrafficViolationAccidentService {

}
