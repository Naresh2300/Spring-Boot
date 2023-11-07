package com.springboot.controller;

import com.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {

    @GetMapping("/StudentDetails")
    public Student getStudent() {
        Student student = new Student(1, "Naresh", "Paliwal");

    return student;
}

    @GetMapping("students")
    public List<Student> getStudents(){

            List<Student> students = new ArrayList<Student>();
                students.add(new Student(1,"Ram","Sharma"));
                students.add(new Student(2,"Virat","Kohli"));
                students.add(new Student(3,"KL","Rahul"));
                 students.add(new Student(4,"Shreyas","Iyer"));

                    return students;

                }

    @GetMapping("studentpath/{id}")
    public Student studenpathvaraible(@PathVariable int id){
        return new Student(id,"John","Don");
    }
    }

