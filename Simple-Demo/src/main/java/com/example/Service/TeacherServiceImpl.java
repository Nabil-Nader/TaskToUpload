
package com.example.Service;

import com.example.database.Student;
import com.example.database.Teacher;
import com.example.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository ;

    public TeacherServiceImpl(TeacherRepository teacherRepository, StudentServiceImpl studentService) {
        this.teacherRepository = teacherRepository;
    }


    @Override
    public Teacher saveTeacher(Teacher theTeacher) {
    	
      Teacher t = teacherRepository.save(theTeacher);
      return t;
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findTeacherById(id);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public Student getStudentByTeacher(Teacher teacher) {
        Long id = teacher.getId();
        for(Student s :teacher.getStudents()){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    @Override
    public void deleteTeacherById(Long id) {
        teacherRepository.deleteById(id);
    }
}

