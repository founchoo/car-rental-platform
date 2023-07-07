package com.dart.carrentalplatform.mapper;

import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dart.carrentalplatform.entity.FinancialStatement;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 7/6/2023
 */
@Mapper
@Repository
public interface FinancialStatementMapper extends MPJBaseMapper<FinancialStatement> {
}