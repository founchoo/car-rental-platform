package com.dart.carrentalplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dart.carrentalplatform.entity.Car;
import com.dart.carrentalplatform.service.CarService;
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
 * @since 6/22/2023 12:13 PM
 */
@Controller
@RequestMapping("/car")
@Api
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    @ResponseBody
    @ApiOperation("获取全部车辆")
    public Response getAllCars() {
        List<Car> list = carService.list(null);
        return Response.success().setData("list", list);
    }

    @GetMapping("/search")
    @ResponseBody
    @ApiOperation("模糊查找车辆")
    public Response searchCars(@RequestParam int start, @RequestParam int size, @RequestParam String key) {
        return Response.success().setData("page", carService.page(new Page<>(start, size),
                new QueryWrapper<Car>()
                        .like("id", key).or()
                        .like("brand", key).or()
                        .like("model", key).or()
                        .like("color", key).or()
                        .like("price", key)));
    }

    @ResponseBody
    @PostMapping
    @ApiOperation("添加车辆")
    public Response addCar(@RequestBody Car car) {
        return carService.save(car) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @PutMapping
    @ApiOperation("更新车辆")
    public Response updateCar(@RequestBody Car car) {
        return carService.updateById(car) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @DeleteMapping
    @ApiOperation("删除车辆")
    public Response deleteCar(@RequestParam int id) {
        return carService.removeById(id) ? Response.success() : Response.fail();
    }

    @ResponseBody
    @GetMapping("/getCarByPage")
    @ApiOperation("分页查询数据")
    public Response getCarByPage(@RequestParam int start, @RequestParam int size) {
        return Response.success().setData("page", carService.page(new Page<>(start, size)));
    }
}
