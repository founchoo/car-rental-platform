package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.Customer;
import com.dart.carrentalplatform.service.CustomerService;
import com.dart.carrentalplatform.util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/24/2023 4:22 PM
 */
@Controller
@RequestMapping("/customer")
@Api
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    @ResponseBody
    @ApiOperation("获取全部客户")
    public Response getAllCustomers() {
        List<Customer> list = customerService.list(null);
        return Response.success().setData("list", list);
    }
}
