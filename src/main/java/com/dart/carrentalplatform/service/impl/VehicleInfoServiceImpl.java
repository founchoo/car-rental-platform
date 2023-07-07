package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.VehicleInfo;
import com.dart.carrentalplatform.mapper.VehicleInfoMapper;
import com.dart.carrentalplatform.service.VehicleInfoService;

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
public class VehicleInfoServiceImpl extends BaseServiceImpl<VehicleInfoMapper, VehicleInfo> implements VehicleInfoService {

}
