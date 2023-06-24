package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.Customer;
import com.dart.carrentalplatform.service.ICustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/24/2023 4:22 PM
 */
@Controller
@Api
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "/getCustomers", method = POST)
    @ResponseBody
    @ApiOperation("获取全部客户")
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }
}
