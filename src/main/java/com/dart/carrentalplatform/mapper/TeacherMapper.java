package com.dart.carrentalplatform.mapper;

import com.dart.carrentalplatform.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Dart
 * @project car-rental-platform
 * @since 6/23/2023 6:56 PM
 */
@Repository
public interface TeacherMapper {

    List<Teacher> getAllTeachers();
    void addTeacher(int id, String name, String gender, int age, String dept, String address);
    void deleteTeacher(int id);
    void updateTeacher(int id, String name, String gender, int age, String dept, String address);
    Teacher getTeacherById(int id);
    List<Teacher> getProComputerTeachers();
}
