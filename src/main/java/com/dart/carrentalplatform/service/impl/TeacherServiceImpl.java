package com.dart.carrentalplatform.service.impl;

import com.dart.carrentalplatform.entity.Teacher;
import com.dart.carrentalplatform.mapper.TeacherMapper;
import com.dart.carrentalplatform.service.ITeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/23/2023 7:02 PM
 */
@Service
public class TeacherServiceImpl implements ITeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public void addTeacher(int id, String name, String gender, int age, String dept, String address) {
        teacherMapper.addTeacher(id, name, gender, age, dept, address);
    }

    @Override
    public void deleteTeacher(int id) {
        teacherMapper.deleteTeacher(id);
    }

    @Override
    public void updateTeacher(int id, String name, String gender, int age, String dept, String address) {
        teacherMapper.updateTeacher(id, name, gender, age, dept, address);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherMapper.getAllTeachers();
    }

    @Override
    public Teacher getTeacherById(int id) {
        return teacherMapper.getTeacherById(id);
    }

    @Override
    public List<Teacher> getProComputerTeachers() {
        return teacherMapper.getProComputerTeachers();
    }
}
