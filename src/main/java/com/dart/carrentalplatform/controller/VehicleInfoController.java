package com.dart.carrentalplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dart.carrentalplatform.entity.VehicleInfo;
import com.dart.carrentalplatform.service.VehicleInfoService;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/24/2023 4:22 PM
 */
@Controller
@RequestMapping("/vehicle_info")
public class VehicleInfoController extends BaseController<VehicleInfoService, VehicleInfo> {

}
