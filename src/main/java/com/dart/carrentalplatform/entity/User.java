package com.dart.carrentalplatform.entity;

import lombok.Data;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/26/2023 2:07 PM
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String lasttime;
    private String ip;
}
