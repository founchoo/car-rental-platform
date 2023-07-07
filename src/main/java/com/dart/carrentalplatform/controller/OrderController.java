package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.Order;
import com.dart.carrentalplatform.service.OrderService;
import com.dart.carrentalplatform.util.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dart
 * @project order-rental-platform
 * @since 6/27/2023 10:45 AM
 */
@Controller
@RequestMapping("/order")
public class OrderController extends BaseController<OrderService, Order> {

	@Override
	@ResponseBody
    @PostMapping("/add")
    public Response add(@RequestBody Order data) {
        return service.save(data) ? Response.success() : Response.fail();
    }
}
