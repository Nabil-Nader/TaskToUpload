package com.example.Service;

import com.example.Exception.UserNotFoundException;
import com.example.database.Teacher;
import com.example.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private  final TeacherRepository teacherRepository ;


    public TeacherService(TeacherRepository userRepository) {
        this.teacherRepository = userRepository;
    }

    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Long id){
        return teacherRepository.findTeacherById(id)
                .orElseThrow(()-> new UserNotFoundException
                        ("Teacher by this Id " +id +" was not found"));
    }

    public Teacher saveTeacher(Teacher newTeacher){
        Teacher addTeacher = teacherRepository.save(newTeacher);
        return addTeacher;
    }

    public void deleteTeacherById(Long id){
        teacherRepository.deleteById(id);
    }



}
