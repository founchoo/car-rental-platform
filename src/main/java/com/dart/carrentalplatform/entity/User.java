package com.dart.carrentalplatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/26/2023 2:07 PM
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User extends BaseEntity {
    private String username;
    private String password;
    private String lasttime;
    private String ip;
}
