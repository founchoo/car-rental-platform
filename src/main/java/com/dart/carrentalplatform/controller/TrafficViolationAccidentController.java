package com.dart.carrentalplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dart.carrentalplatform.entity.TrafficViolationAccident;
import com.dart.carrentalplatform.service.TrafficViolationAccidentService;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 6/30/2023 5:32 PM
 */
@Controller
@RequestMapping("/traffic_violation_accident")
public class TrafficViolationAccidentController extends BaseController<TrafficViolationAccidentService, TrafficViolationAccident> {

}
