package com.springboot.enoca.challenge.service;

import com.springboot.enoca.challenge.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student save (Student theStudent);
    Student findById(int id);
    void deleteById(Integer id);
}
