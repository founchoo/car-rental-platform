package com.dart.carrentalplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dart.carrentalplatform.entity.TrafficViolationAccident;

import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 6/30/2023
 */
@Mapper
@Repository
public interface TrafficViolationAccidentMapper extends MPJBaseMapper<TrafficViolationAccident> {
}
