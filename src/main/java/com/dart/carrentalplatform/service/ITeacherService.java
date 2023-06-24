package com.dart.carrentalplatform.service;

import com.dart.carrentalplatform.entity.Teacher;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/23/2023 7:01 PM
 */
public interface ITeacherService {
    void addTeacher(int id, String name, String gender, int age, String dept, String address);

    void deleteTeacher(int id);

    void updateTeacher(int id, String name, String gender, int age, String dept, String address);

    List<Teacher> getAllTeachers();

    Teacher getTeacherById(int id);

    List<Teacher> getProComputerTeachers();
}
