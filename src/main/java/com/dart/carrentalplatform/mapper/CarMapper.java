package com.dart.carrentalplatform.mapper;

import com.dart.carrentalplatform.entity.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:40 PM
 */
@Repository
public interface CarMapper {
    List<Car> getAllCars();
    void addCar(int id, String brand, String model, String color, double price, String status);
    void deleteCar(int id);
    void updateCar(int id, String brand, String model, String color, double price, String status);
    List<Car> searchCars(String key);
}