package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.CustomerInfo;
import com.dart.carrentalplatform.service.CustomerInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/24/2023 4:22 PM
 */
@Controller
@RequestMapping("/customer_info")
public class CustomerInfoController extends BaseController<CustomerInfoService, CustomerInfo> {

	
}
