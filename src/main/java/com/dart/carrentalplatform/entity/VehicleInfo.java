package com.dart.carrentalplatform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 *
 * @author Dart Lin
 * @since 2023-06-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@TableName("vehicle_info")
//车辆基本信息
public class VehicleInfo extends BaseEntity {
    private String manufacturer;
    private String brand;
    private boolean energy_type;
    private String buy_time;
    private Integer rental_fee;
    private Integer buy_price;
    private Boolean accident;
    private Integer seat_count;
    private String license_plate_number;
    private String car_id;
    private Boolean lease_status;
    private String color;
    private String img;
    private Integer total_distance;
}
