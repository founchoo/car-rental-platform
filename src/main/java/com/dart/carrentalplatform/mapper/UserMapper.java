package com.dart.carrentalplatform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dart.carrentalplatform.entity.User;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/27/2023 9:38 AM
 */
@Mapper
@Repository
public interface UserMapper extends MPJBaseMapper<User> {

}
