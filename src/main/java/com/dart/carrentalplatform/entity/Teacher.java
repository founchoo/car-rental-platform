package com.dart.carrentalplatform.entity;

import lombok.Data;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/23/2023 6:59 PM
 */
@Data
public class Teacher {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String dept;
    private String address;
    private Boolean deleted;
}