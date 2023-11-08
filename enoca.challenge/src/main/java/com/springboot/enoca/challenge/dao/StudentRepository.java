package com.springboot.enoca.challenge.dao;

import com.springboot.enoca.challenge.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
