package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.Car;
import com.dart.carrentalplatform.mapper.CarMapper;
import com.dart.carrentalplatform.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:33 PM
 */
@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;


    @Override
    public void addCar(int id, double price) {
        carMapper.addCar(id, price);
    }

    @Override
    public void deleteCar(int id) {
        carMapper.deleteCar(id);
    }

    @Override
    public void updateCar(int id, double price) {
        carMapper.updateCar(id, price);
    }

    @Override
    public List<Car> getAllCars() {
        return carMapper.getAllCars();
    }

    @Override
    public Car getCarById(int id) {
        return carMapper.getCarById(id);
    }
}