package com.dart.carrentalplatform.entity;

import lombok.Data;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/26/2023 10:30 PM
 */
@Data
public class Order {
    private Integer id;
    private Integer customer_id;
    private Integer car_id;
    private Integer day;
}
