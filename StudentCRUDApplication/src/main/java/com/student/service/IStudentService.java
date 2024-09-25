package com.student.service;

import com.student.model.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> getAllStudents();
    public Student getStudent(int id);
    public String createStudent(Student student);
    public String updateStudent(Student student);
    public String deleteStudent(int id);

}
