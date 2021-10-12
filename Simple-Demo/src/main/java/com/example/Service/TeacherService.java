package com.example.Service;


import com.example.database.Student;
import com.example.database.Teacher;

import java.util.List;

public interface TeacherService {


    Teacher saveTeacher(Teacher theTeacher);

    Teacher getTeacherById(Long id);

    List<Teacher> getAllTeacher();

    Student getStudentByTeacher(Teacher teacher);


    void deleteTeacherById(Long id);
}
