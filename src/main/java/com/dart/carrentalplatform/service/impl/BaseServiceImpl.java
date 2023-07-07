package com.dart.carrentalplatform.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.yulichang.base.MPJBaseMapper;
import com.github.yulichang.base.MPJBaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/29/2023 2:10 PM
 */
public class BaseServiceImpl<M extends MPJBaseMapper<T>, T> extends MPJBaseServiceImpl<M, T> {

    @Autowired
    protected HttpServletRequest request;

}

