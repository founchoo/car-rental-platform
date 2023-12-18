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
 * @author Lin
 * @since 2023-06-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@TableName("booking")
//用户租车记录
public class Order extends BaseEntity {
    /*
     * 用户ID
     */
    private String cid;
    /*
     * 车辆ID
     */
    private String vid;
    /*
     * 经手人
     */
    private String manager;
    private String rent_address;
    private String rent_date;
    private String return_address;
    private String return_date;
    /**
     * 总租借费用
     */
    private Integer total_rental_fee;
    private Integer run_distance;
    private Integer total_distance;
    /*
     * 是否违约
     */
    private Boolean break_rule;
    private Boolean accident;
    private Integer deposit_fee;
    private String deposit_status;
}
