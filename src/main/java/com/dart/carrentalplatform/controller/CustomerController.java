package com.dart.carrentalplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dart.carrentalplatform.entity.Car;
import com.dart.carrentalplatform.entity.Customer;
import com.dart.carrentalplatform.service.CustomerService;
import com.dart.carrentalplatform.util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/24/2023 4:22 PM
 */
@Controller
@CrossOrigin
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

    @GetMapping("/search")
    @ResponseBody
    @ApiOperation("模糊查找客户")
    public Response searchCustomers(@RequestParam int start, @RequestParam int size, @RequestParam String key) {
        // TODO: 目前仅实现按照 ID 查找客户的功能，未能实现所有属性的模糊查找
        Page<Customer> page = customerService.page(new Page<>(start, size));
        QueryWrapper<Customer> wrapper = new QueryWrapper<Customer>().eq("id", key);
        page = customerService.page(page, wrapper);
        return Response.success().setData("page", page);
    }

    @ResponseBody
    @PostMapping
    @ApiOperation("添加客户")
    public Response addCustomer(@RequestBody Customer customer) {
        return customerService.save(customer) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @PutMapping
    @ApiOperation("更新客户")
    public Response updateCustomer(@RequestBody Customer customer) {
        return customerService.updateById(customer) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @DeleteMapping
    @ApiOperation("删除客户")
    public Response deleteCar(@RequestParam int id) {
        return customerService.removeById(id) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @GetMapping("/getCustomerByPage")
    @ApiOperation("分页查询数据")
    public Response getCarByPage(@RequestParam int start, @RequestParam int size) {
        Page<Customer> page = customerService.page(new Page<>(start, size));
        return Response.success().setData("page", page);
    }
}
