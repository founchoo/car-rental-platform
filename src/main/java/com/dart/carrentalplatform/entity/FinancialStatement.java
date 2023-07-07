package com.dart.carrentalplatform.entity;

import lombok.Data;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 7/6/2023
 */
@Data
public class FinancialStatement {
    private Double totalIncome; // 总收入
    private Double totalOutput; // 总支出
    private Double profit; // 利润

    public Double getProfit() {
        return this.totalIncome - this.totalOutput;
    }
}