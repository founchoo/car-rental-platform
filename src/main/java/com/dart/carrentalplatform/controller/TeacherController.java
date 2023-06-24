package com.dart.carrentalplatform.controller;

import com.dart.carrentalplatform.entity.Teacher;
import com.dart.carrentalplatform.service.ITeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/24/2023 6:04 PM
 */
@Controller
@Api("教师管理")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @RequestMapping(value = "/getTeachers", method = GET)
    @ResponseBody
    @ApiOperation("获取全部教师")
    public List<Teacher> getTeachers() {
        return teacherService.getAllTeachers();
    }

    @RequestMapping(value = "/getTeacherById", method = GET)
    @ResponseBody
    @ApiOperation("获取指定id的教师")
    public Teacher getTeacherById(int id) {
        return teacherService.getTeacherById(id);
    }

    @RequestMapping(value = "/addTeacher", method = POST)
    @ResponseBody
    @ApiOperation("添加教师")
    public void addTeacher(Teacher teacher) {
        teacherService.addTeacher(
                teacher.getId(), teacher.getName(), teacher.getGender(),
                teacher.getAge(), teacher.getDept(), teacher.getAddress());
    }

    @RequestMapping(value = "/updateTeacher", method = POST)
    @ResponseBody
    @ApiOperation("更新教师")
    public void updateTeacher(Teacher teacher) {
        teacherService.updateTeacher(
                teacher.getId(), teacher.getName(), teacher.getGender(),
                teacher.getAge(), teacher.getDept(), teacher.getAddress());
    }

    @RequestMapping(value = "/deleteTeacher", method = POST)
    @ResponseBody
    @ApiOperation("删除教师")
    public void deleteTeacher(int id) {
        teacherService.deleteTeacher(id);
    }

    @RequestMapping(value = "/getProComputerTeachers", method = GET)
    @ResponseBody
    @ApiOperation("获取计算机专业教师")
    public List<Teacher> getProComputerTeachers() {
        return teacherService.getProComputerTeachers();
    }
}
