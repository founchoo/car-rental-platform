package com.dart.carrentalplatform.service;

import com.dart.carrentalplatform.entity.Car;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:37 PM
 */
public interface CarService {

    void addCar(int id, double price);

    void deleteCar(int id);

    void updateCar(int id, double price);

    List<Car> getAllCars();

    Car getCarById(int id);
}