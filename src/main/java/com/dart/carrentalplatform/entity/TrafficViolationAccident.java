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
@TableName("traffic_violation_accident")
//车辆历史租赁信息
public class TrafficViolationAccident extends BaseEntity {
    /*
     * 用户ID
     */
    private String cid;
    /*
     * 车辆ID
     */
    private String vid;
    private Integer violate_count;
    private String violate_info;
    private Boolean violation;
    private Integer accident_count;
    private String accident_info;
    private String manager;
}