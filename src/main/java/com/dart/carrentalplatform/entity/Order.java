package com.dart.carrentalplatform.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/26/2023 10:30 PM
 */
@Data
@TableName("booking")
public class Order {
    private Integer id;
    private Integer customer_id;
    private Integer car_id;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private Double total_cost;
}
