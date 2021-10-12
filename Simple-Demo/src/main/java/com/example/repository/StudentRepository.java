package com.example.repository;

import com.example.database.Student;

import com.example.database.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findStudentById(Long id);

}
