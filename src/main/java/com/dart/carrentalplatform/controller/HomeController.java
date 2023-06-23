package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.Car;
import com.dart.carrentalplatform.entity.Customer;
import com.dart.carrentalplatform.service.CarService;
import com.dart.carrentalplatform.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:13 PM
 */
@Controller
public class HomeController {

    @Autowired
    private CarService carService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/cars", method = GET)
    @ResponseBody
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @RequestMapping(value = "/customers", method = GET)
    @ResponseBody
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }
}
