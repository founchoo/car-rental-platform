package com.dart.carrentalplatform.entity;

import lombok.Data;

@Data
public class VehicleMaintenanceResult {

    private String id;
    private String vid;
    private Integer total_distance;
    private Integer maintenance_fee;
    private Integer maintenance_times;
}
