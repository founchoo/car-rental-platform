package com.dart.carrentalplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dart.carrentalplatform.entity.User;
import com.dart.carrentalplatform.mapper.UserMapper;
import com.dart.carrentalplatform.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/27/2023 9:38 AM
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
