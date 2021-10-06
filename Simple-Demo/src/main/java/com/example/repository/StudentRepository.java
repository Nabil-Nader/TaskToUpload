package com.example.repository;

import com.example.database.Student;
import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
   Optional<Student> findByLastName(String lastName) ;

   Optional<Student> findStudentById(Long id);

}
