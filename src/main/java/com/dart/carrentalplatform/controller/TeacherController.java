package com.dart.carrentalplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dart.carrentalplatform.entity.Car;
import com.dart.carrentalplatform.entity.Teacher;
import com.dart.carrentalplatform.service.TeacherService;
import com.dart.carrentalplatform.util.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/24/2023 6:04 PM
 */
@Controller
@RequestMapping("/teacher")
@Api("教师管理")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    @ResponseBody
    @ApiOperation("获取全部教师")
    public Response getTeachers() {
        return Response.success().setData("list", teacherService.list(null));
    }

    @GetMapping("/getTeacherById")
    @ResponseBody
    @ApiOperation("获取指定id的教师")
    public Response getTeacherById(@RequestParam int id) {
        return Response.success().setData("teacher", teacherService.getById(id));
    }

    @PostMapping
    @ResponseBody
    @ApiOperation("添加教师")
    public Response addTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher) ? Response.success() : Response.fail();
    }

    @PutMapping
    @ResponseBody
    @ApiOperation("更新教师")
    public Response updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.updateById(teacher) ? Response.success() : Response.fail();
    }

    @DeleteMapping
    @ResponseBody
    @ApiOperation("删除教师")
    public Response deleteTeacher(@RequestParam int id) {
        return teacherService.removeById(id) ? Response.success() : Response.fail();
    }

    @GetMapping(value = "/getProComputerTeachers")
    @ResponseBody
    @ApiOperation("获取计算机专业教师")
    public Response getProComputerTeachers() {
        QueryWrapper<Teacher> wrapper = new QueryWrapper<Teacher>();
        return Response.success().setData("list",
                teacherService.list(
                        wrapper.ge("age", 30)
                                .eq("dept", "计算机")));
    }

    @ResponseBody
    @GetMapping("/getTeacherByPage")
    @ApiOperation("分页查询数据")
    public Response getCarByPage(@RequestParam int start, @RequestParam int size) {
        Page<Teacher> page = new Page<>(start, size);
        teacherService.page(page);
        return Response.success().setData("page", page);
    }
}
