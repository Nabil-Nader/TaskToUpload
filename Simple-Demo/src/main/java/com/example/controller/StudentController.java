package com.example.controller;

import com.example.Exception.UserNotFoundException;
import com.example.Service.StudentService;
import com.example.database.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private final StudentService studentService ;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public ResponseEntity< List<Student>> getAllStudents(){
        List<Student> students = studentService.getStudents();
        return new ResponseEntity<>(students, HttpStatus.OK) ;
    }

    @GetMapping("find/{id}")
    public ResponseEntity <Student>  getStudent(@PathVariable("id") Long id){
        Student theStudent = studentService.getStudentById(id);

        if (theStudent == null){
            throw new UserNotFoundException("Student id not found :"+id);
        }
        return new ResponseEntity<>(theStudent, HttpStatus.OK) ;
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student newStudent){

        Student theStudent = studentService.saveStudent(newStudent);
       return new ResponseEntity<>(theStudent, HttpStatus.CREATED) ;
    }
    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student newStudent){
        Student theStudent = studentService.saveStudent(newStudent);
        return new ResponseEntity<>(theStudent, HttpStatus.OK) ;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable("id") Long id){
        Student tempStudent = studentService.getStudentById(id);

        if (tempStudent == null) {
            throw new UserNotFoundException("Student id not found - " + id);
        }

        studentService.deleteStudent(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }







}
