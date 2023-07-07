package com.dart.carrentalplatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dart.carrentalplatform.entity.FinancialStatementOutput;
import com.dart.carrentalplatform.entity.TrafficViolationAccident;
import com.dart.carrentalplatform.entity.VehicleInfo;
import com.dart.carrentalplatform.entity.VehicleMaintenance;
import com.dart.carrentalplatform.service.VehicleInfoService;
import com.dart.carrentalplatform.util.Response;
import com.github.yulichang.wrapper.MPJLambdaWrapper;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 7/6/2023
 */

@Controller
@RequestMapping("/financial_statement_output")
public class FinancialStatementOutputController
		extends BaseController<VehicleInfoService, VehicleInfo> {

	@Override
	@ResponseBody
	@GetMapping("/getAllByPage")
	public Response getAllByPage(@RequestParam int start, @RequestParam int size) {
		MPJLambdaWrapper<VehicleInfo> wrapper = new MPJLambdaWrapper<VehicleInfo>()
				.select(VehicleInfo::getManufacturer, VehicleInfo::getBrand, VehicleInfo::getId)
				.select(VehicleMaintenance::getMaintenance_fee)
				.leftJoin(VehicleMaintenance.class, VehicleMaintenance::getVid, VehicleInfo::getId)
				.select(TrafficViolationAccident::getAccident_count, TrafficViolationAccident::getViolate_count)
				.leftJoin(TrafficViolationAccident.class, TrafficViolationAccident::getVid, VehicleInfo::getId);

		return Response.success().setData(
				"page", service.selectJoinListPage(new Page<>(start, size), FinancialStatementOutput.class, wrapper));
	}
}