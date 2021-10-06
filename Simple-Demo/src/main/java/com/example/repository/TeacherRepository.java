package com.example.repository;

import com.example.database.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository  extends JpaRepository<Teacher,Long> {

    Optional<Teacher> findTeacherById(Long id);
}
