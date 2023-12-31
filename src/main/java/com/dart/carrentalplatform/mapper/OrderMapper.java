package com.dart.carrentalplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dart.carrentalplatform.entity.Order;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:40 PM
 */
@Mapper
@Repository
public interface OrderMapper extends MPJBaseMapper<Order> {
}
