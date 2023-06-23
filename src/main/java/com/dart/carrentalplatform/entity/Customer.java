package com.dart.carrentalplatform.entity;

import lombok.Data;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:14 PM
 */
@Data
public class Customer {
    private int id;
    private String card;
    private String name;
    private String phone;
}
