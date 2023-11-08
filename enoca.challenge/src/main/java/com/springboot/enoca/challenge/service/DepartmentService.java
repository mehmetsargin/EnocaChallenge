package com.springboot.enoca.challenge.service;

import com.springboot.enoca.challenge.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
    Department save (Department theDepartment);
    Department findById(int id);
    void deleteById(Integer id);
}
