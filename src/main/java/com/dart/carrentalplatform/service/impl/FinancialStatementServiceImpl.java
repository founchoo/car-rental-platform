package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.FinancialStatement;
import com.dart.carrentalplatform.mapper.FinancialStatementMapper;
import com.dart.carrentalplatform.service.FinancialStatementService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 6/30/2023
 */
@RequiredArgsConstructor
@Service
@Transactional(rollbackFor = Exception.class)
public class FinancialStatementServiceImpl extends BaseServiceImpl<FinancialStatementMapper, FinancialStatement>
		implements
		FinancialStatementService {

}
