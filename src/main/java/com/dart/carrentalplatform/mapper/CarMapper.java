package com.dart.carrentalplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dart.carrentalplatform.entity.Car;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:40 PM
 */
public interface CarMapper extends BaseMapper<Car> {
}