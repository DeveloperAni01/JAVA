package com.example.springBoot_jdbc_demo.service;

import com.example.springBoot_jdbc_demo.model.Student;
import com.example.springBoot_jdbc_demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo repo;

    public void addStudent(Student st) {
       repo.save(st);
    }


    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
