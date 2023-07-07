package com.dart.carrentalplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Dart Lin
 * @since 2023-06-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@TableName("vehicle_maintenance")
//车辆保养信息
public class VehicleMaintenance extends BaseEntity {
    /*
     * 车辆ID
     */
    private String vid;
    private Integer maintenance_fee;
    private Integer maintenance_times;
}

