package com.student.controller;

import com.student.model.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentContoller {

    @Autowired
    StudentService studentService;

    @GetMapping("/allstudents")
    public List<Student> getStudents() {
        return  studentService.getAllStudents();
    }

    @GetMapping("/{studentid}")
    public Student getStudent(@PathVariable("studentid") int id) {
        return studentService.getStudent(id);
    }
    @PostMapping
    public String createStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return "Student created";

    }

    @PutMapping
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Student updated";

    }

    @DeleteMapping("/{sid}")
    public String updateStudent(@PathVariable("sid") int id){
        studentService.deleteStudent(id);
        return "Student deleted";

    }
}