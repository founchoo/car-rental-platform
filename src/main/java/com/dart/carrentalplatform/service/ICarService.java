package com.dart.carrentalplatform.service;

import com.dart.carrentalplatform.entity.Car;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:37 PM
 */
public interface ICarService {

    void addCar(int id, String brand, String model, String color, double price, String status);

    void deleteCar(int id);

    void updateCar(int id, String brand, String model, String color, double price, String status);

    List<Car> getAllCars();

    List<Car> searchCars(String key);
}