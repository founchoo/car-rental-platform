package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.Car;
import com.dart.carrentalplatform.service.ICarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:13 PM
 */
@Controller
@Api
public class CarController {

    @Autowired
    private ICarService carService;

    @RequestMapping(value = "/getCars", method = POST)
    @ResponseBody
    @ApiOperation("获取全部车辆")
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @RequestMapping(value = "/searchCar", method = POST)
    @ResponseBody
    @ApiOperation("获取指定id的车辆")
    public Car getCarById(@RequestParam String key) {
        return carService.searchCars(key);
    }

    @ResponseBody
    @RequestMapping(value = "/addCar", method = POST)
    @ApiOperation("添加车辆")
    public void addCar(@RequestBody Car car) {
        carService.addCar(
                car.getId(), car.getBrand(), car.getModel(),
                car.getColor(), car.getPrice(), car.getStatus());
    }

    @ResponseBody
    @RequestMapping(value = "/updateCar", method = POST)
    @ApiOperation("更新车辆")
    public void updateCar(@RequestBody Car car) {
        carService.updateCar(
                car.getId(), car.getBrand(), car.getModel(),
                car.getColor(), car.getPrice(), car.getStatus());
    }

    @ResponseBody
    @RequestMapping(value = "/deleteCar", method = POST)
    @ApiOperation("删除车辆")
    public void deleteCar(@RequestParam int id) {
        carService.deleteCar(id);
    }
}
