package com.springboot.enoca.challenge.dao;

import com.springboot.enoca.challenge.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
