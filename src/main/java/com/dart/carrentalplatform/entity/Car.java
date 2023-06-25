package com.dart.carrentalplatform.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:26 PM
 */
@Data
public class Car {
    private Integer id;
    private Double price;
    private String brand;
    private String model;
    private String status;
    private String color;
    private Boolean deleted;
}
