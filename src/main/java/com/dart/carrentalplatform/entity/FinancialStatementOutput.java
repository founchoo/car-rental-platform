package com.dart.carrentalplatform.entity;

import lombok.Data;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 7/6/2023
 */
@Data
public class FinancialStatementOutput {
    private String id;// 车辆ID
    private String manufacturer;// 厂商
    private String brand;// 品牌
    private Integer maintenance_fee;//保养费用
    private Integer violate_count;//违章计数
    private Integer accident_count;//事故计数
}