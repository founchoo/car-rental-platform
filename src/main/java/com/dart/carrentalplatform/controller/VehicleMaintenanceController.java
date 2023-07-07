package com.dart.carrentalplatform.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dart.carrentalplatform.entity.VehicleInfo;
import com.dart.carrentalplatform.entity.VehicleMaintenance;
import com.dart.carrentalplatform.entity.VehicleMaintenanceResult;
import com.dart.carrentalplatform.service.VehicleMaintenanceService;
import com.dart.carrentalplatform.util.Response;

import com.github.yulichang.wrapper.MPJLambdaWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lin
 * @project car-rental-platform
 * @since 6/30/2023 5:32 PM
 */
@Controller
@RequestMapping("/vehicle_maintenance")
public class VehicleMaintenanceController extends BaseController<VehicleMaintenanceService, VehicleMaintenance> {

    @Override
    @ResponseBody
    @GetMapping("/getAllByPage")
    public Response getAllByPage(@RequestParam int start, @RequestParam int size) {

        MPJLambdaWrapper<VehicleMaintenance> wrapper = new MPJLambdaWrapper<VehicleMaintenance>()
                // 选择 汽车保养 表全部字段
                .selectAll(VehicleMaintenance.class)
                // 选择 汽车信息 表中的 total_distance 字段
                .select(VehicleInfo::getTotal_distance)
                // 左连接 汽车信息 表 当 汽车信息表中的 id 字段 等于 汽车保养 表中的 vid 字段
                .leftJoin(VehicleInfo.class, VehicleInfo::getId, VehicleMaintenance::getVid);

        return Response.success().setData(
                "page", service.selectJoinListPage(new Page<>(start, size), VehicleMaintenanceResult.class, wrapper));
    }

    @Override
    @ResponseBody
    @PutMapping("/update")
    public Response update(@RequestBody VehicleMaintenance data) {
        return service.updateById(data) ? Response.success() : Response.fail();
    }
}
