package com.springboot.enoca.challenge.service;

import com.springboot.enoca.challenge.dao.DepartmentRepository;
import com.springboot.enoca.challenge.entity.Department;
import com.springboot.enoca.challenge.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department save(Department theDepartment) {
        return departmentRepository.save(theDepartment);
    }

    @Override
    public Department findById(int id) {
        Optional<Department> result = departmentRepository.findById(id);
        Department theDepartment=null;

        if(result.isPresent()){
            theDepartment=result.get();
        }
        else{
            throw new RuntimeException("Didn't find department id - "+ id);
        }
        return theDepartment;
    }

    @Override
    public void deleteById(Integer id) {
        departmentRepository.deleteById(id);
    }
}
