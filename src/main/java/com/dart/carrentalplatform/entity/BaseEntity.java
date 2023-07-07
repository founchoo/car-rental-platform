package com.dart.carrentalplatform.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/30/2023 4:40 PM
 */
@Data
public class BaseEntity implements Serializable {
    /**
     * 主键ID
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    /**
     * 数据库数据标识逻辑删除字段，0(false)为正常，1(true)为逻辑删除，默认为0(false)
     */
    @JsonIgnore
    @TableLogic
    private Boolean deleted;
}

