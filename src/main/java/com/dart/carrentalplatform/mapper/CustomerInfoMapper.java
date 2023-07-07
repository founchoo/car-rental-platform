package com.dart.carrentalplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dart.carrentalplatform.entity.CustomerInfo;

import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 4:24 PM
 */
@Mapper
@Repository
public interface CustomerInfoMapper extends MPJBaseMapper<CustomerInfo> {
}
