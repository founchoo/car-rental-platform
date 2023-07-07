package com.dart.carrentalplatform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:14 PM
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@TableName("customer_info")
//用户基础信息
public class CustomerInfo extends BaseEntity {
    private String name;
    private String card;
    private Integer age;
    private String phone;
    private Boolean gender;
    private Date birthday;
    private String address;
    private Integer violate_count;
    private Integer accident_count;
}
