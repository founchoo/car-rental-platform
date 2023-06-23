package com.dart.carrentalplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/21/2023 10:15 PM
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.dart.carrentalplatform.mapper")
public class CarRentalPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarRentalPlatformApplication.class, args);
    }

}
