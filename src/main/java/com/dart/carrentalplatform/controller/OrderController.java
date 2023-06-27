package com.dart.carrentalplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dart.carrentalplatform.entity.Order;
import com.dart.carrentalplatform.service.OrderService;
import com.dart.carrentalplatform.util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dart
 * @project order-rental-platform
 * @since 6/27/2023 10:45 AM
 */
@Controller
@RequestMapping("/order")
@Api("订单管理")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    @ResponseBody
    @ApiOperation("获取全部订单")
    public Response getAllOrders() {
        List<Order> list = orderService.list(null);
        return Response.success().setData("list", list);
    }

    @GetMapping("/search")
    @ResponseBody
    @ApiOperation("模糊查找订单")
    public Response searchOrders(@RequestParam int start, @RequestParam int size, @RequestParam String key) {
        return Response.success().setData("page", orderService.page(new Page<>(start, size),
                new QueryWrapper<Order>()
                        .like("car_id", key).or()
                        .like("customer_id", key).or()
                        .like("start_time", key).or()
                        .like("end_time", key).or()
                        .like("total_cost", key)));
    }

    @ResponseBody
    @PostMapping
    @ApiOperation("添加订单")
    public Response addOrder(@RequestBody Order order) {
        return orderService.save(order) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @PutMapping
    @ApiOperation("更新订单")
    public Response updateOrder(@RequestBody Order order) {
        return orderService.updateById(order) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @DeleteMapping
    @ApiOperation("删除订单")
    public Response deleteOrder(@RequestParam int id) {
        return orderService.removeById(id) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @GetMapping("/getOrderByPage")
    @ApiOperation("分页查询数据")
    public Response getOrderByPage(@RequestParam int start, @RequestParam int size) {
        return Response.success().setData("page", orderService.page(new Page<>(start, size)));
    }
}
