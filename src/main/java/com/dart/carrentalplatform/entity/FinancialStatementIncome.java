package com.dart.carrentalplatform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 7/6/2023
 */

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class FinancialStatementIncome {
    private String id; // 车辆ID
    private String manufacturer; // 厂商
    private String brand; // 品牌
    private Integer total_distance; // 总里程
    private Integer total_rental_fee; // 出租费用
    private String rent_date; // 出租时间
}
