package com.dart.carrentalplatform.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dart.carrentalplatform.entity.Car;
import com.dart.carrentalplatform.mapper.CarMapper;
import com.dart.carrentalplatform.service.CarService;
import org.springframework.stereotype.Service;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/22/2023 12:33 PM
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

}
