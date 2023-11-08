package com.springboot.enoca.challenge.rest;

import com.springboot.enoca.challenge.entity.Department;
import com.springboot.enoca.challenge.entity.Student;
import com.springboot.enoca.challenge.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentRestController {

    private DepartmentService departmentService;

    public DepartmentRestController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/departments")
    public List<Department> findAll(){
        return departmentService.findAll();
    }

    @GetMapping("/departments/{departmentId}")
    public Department getDepartment (@PathVariable int departmentId){

        Department theDepartment = departmentService.findById(departmentId);

        if(theDepartment==null){
            throw new RuntimeException("Department id not found - "+ departmentId);
        }

        return theDepartment;
    }

    @PostMapping("/departments")
    public Department addDepartment(@RequestBody Department theDepartment){
        theDepartment.setId_department(0);

        Department dbDepartment = departmentService.save(theDepartment);

        return dbDepartment;
    }

    @PutMapping("/departments")
    public Department updateDepartment (@RequestBody Department theDepartment){

        Department dbDepartment = departmentService.save(theDepartment);

        return dbDepartment;
    }

    @DeleteMapping("/departments/{departmentId}")
    public String deleteDepartment ( @PathVariable int departmentId){
        Department tempDepartment = departmentService.findById(departmentId);

        if(tempDepartment== null){
            throw new RuntimeException("Department id not found - "+departmentId);
        }
        departmentService.deleteById(departmentId);

        return "Deleted department id - " + departmentId;
    }

}
