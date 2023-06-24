package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.Car;
import com.dart.carrentalplatform.mapper.CarMapper;
import com.dart.carrentalplatform.service.ICarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:33 PM
 */
@Service
public class CarServiceImpl implements ICarService {

    @Resource
    private CarMapper carMapper;


    @Override
    public void addCar(int id, String brand, String model, String color, double price, String status) {
        carMapper.addCar(id, brand, model, color, price, status);
    }

    @Override
    public void deleteCar(int id) {
        carMapper.deleteCar(id);
    }

    @Override
    public void updateCar(int id, String brand, String model, String color, double price, String status) {
        carMapper.updateCar(id, brand, model, color, price, status);
    }

    @Override
    public List<Car> getAllCars() {
        return carMapper.getAllCars();
    }

    @Override
    public List<Car> searchCars(String key) {
        return carMapper.searchCars(key);
    }
}