package com.example.Service;

import com.example.Exception.UserNotFoundException;
import com.example.database.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository ;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Optional<Student> getStudentInformation(String lastName){
        return studentRepository.findByLastName(lastName);
    }

    public Student getStudentById(Long id){

        return studentRepository.findStudentById(id)
                .orElseThrow(()-> new UserNotFoundException("Student by id " +id
                        +"was not found"));
    }

    public List<Student> getStudents(){
         return studentRepository.findAll();
    }

    public Student saveStudent(Student newStudent){
        return studentRepository.save(newStudent);
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }



}
