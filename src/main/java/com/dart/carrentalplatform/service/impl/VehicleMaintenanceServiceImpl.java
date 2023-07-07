package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.VehicleMaintenance;
import com.dart.carrentalplatform.mapper.VehicleMaintenanceMapper;
import com.dart.carrentalplatform.service.VehicleMaintenanceService;

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
public class VehicleMaintenanceServiceImpl extends BaseServiceImpl<VehicleMaintenanceMapper, VehicleMaintenance> implements VehicleMaintenanceService {

}
