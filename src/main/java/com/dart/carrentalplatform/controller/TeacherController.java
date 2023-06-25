package com.dart.carrentalplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dart.carrentalplatform.entity.Teacher;
import com.dart.carrentalplatform.service.TeacherService;
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
    public List<Teacher> getTeachers() {
        return teacherService.list();
    }

    @GetMapping("/getTeacherById")
    @ResponseBody
    @ApiOperation("获取指定id的教师")
    public Teacher getTeacherById(@RequestParam int id) {
        return teacherService.getById(id);
    }

    @PostMapping
    @ResponseBody
    @ApiOperation("添加教师")
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.save(teacher);
    }

    @PutMapping
    @ResponseBody
    @ApiOperation("更新教师")
    public void updateTeacher(@RequestBody Teacher teacher) {
        teacherService.updateById(teacher);
    }

    @DeleteMapping
    @ResponseBody
    @ApiOperation("删除教师")
    public void deleteTeacher(@RequestParam int id) {
        teacherService.removeById(id);
    }

    @GetMapping(value = "/getProComputerTeachers")
    @ResponseBody
    @ApiOperation("获取计算机专业教师")
    public List<Teacher> getProComputerTeachers() {
        QueryWrapper<Teacher> wrapper = new QueryWrapper<Teacher>();
        return teacherService.list(
                wrapper.ge("age", 30)
                        .eq("dept", "计算机"));
    }
}
