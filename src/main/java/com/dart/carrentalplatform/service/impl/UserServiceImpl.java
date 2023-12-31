package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.User;
import com.dart.carrentalplatform.mapper.UserMapper;
import com.dart.carrentalplatform.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/27/2023 9:38 AM
 */
@RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

}
