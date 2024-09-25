package com.student.service;

import com.student.model.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @Override
    public Student getStudent(int id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    @Override
    public String createStudent(Student student) {
        studentRepository.save(student);
        return "student created successfully";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "updated successfully";
    }

    @Override
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "deleted successfully";
    }
}
