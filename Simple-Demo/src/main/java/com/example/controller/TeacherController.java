package com.example.controller;

import com.example.Exception.UserNotFoundException;
import com.example.Service.StudentService;
import com.example.Service.TeacherService;
import com.example.database.Student;
import com.example.database.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/teachers")
public class TeacherController {

    @Autowired
    private final TeacherService teacherService ;

    @Autowired
    private final StudentService studentService;

    public TeacherController(TeacherService teacherService, StudentService studentService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }


    @GetMapping("/all")
    public ResponseEntity< List<Teacher>> getAllTeachers(){
        List<Teacher> teachers = teacherService.getAllTeacher();
        return new ResponseEntity<>(teachers, HttpStatus.OK) ;
    }

    @GetMapping("find/{id}")
    public ResponseEntity <Teacher>  getTeacher(@PathVariable("id") Long id){
        Teacher teacherById = teacherService.getTeacherById(id);

        if (teacherById == null){
            throw new UserNotFoundException("Student id not found :"+id);
        }
        return new ResponseEntity<>(teacherById, HttpStatus.OK) ;
    }

    @PostMapping("/add")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher newTeacher){

        Teacher saveTeacher = teacherService.saveTeacher(newTeacher);
        return new ResponseEntity<>(saveTeacher, HttpStatus.CREATED) ;
    }
    @PutMapping("/update")
    public ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher){
        Teacher updateTeacher = teacherService.saveTeacher(teacher);
        return new ResponseEntity<>(updateTeacher, HttpStatus.OK) ;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable("id") Long id){
        Teacher tempStudent = teacherService.getTeacherById(id);

        if (tempStudent == null) {
            throw new UserNotFoundException("Student id not found - " + id);
        }

        teacherService.deleteTeacherById(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }


}