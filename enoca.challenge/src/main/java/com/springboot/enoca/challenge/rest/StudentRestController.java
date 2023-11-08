package com.springboot.enoca.challenge.rest;

import com.springboot.enoca.challenge.entity.Student;
import com.springboot.enoca.challenge.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent (@PathVariable int studentId){

        Student theStudent = studentService.findById(studentId);

        if(theStudent==null){
            throw new RuntimeException("Student id not found - "+ studentId);
        }

        return theStudent;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student theStudent){
        theStudent.setId(0);

        Student dbStudent = studentService.save(theStudent);

        return dbStudent;
    }

    @PutMapping("/students")
    public Student updateStudent (@RequestBody Student theStudent){

        Student dbStudent = studentService.save(theStudent);

        return dbStudent;
    }

    @DeleteMapping("/students/{studentId}")
    public String deleteStudent ( @PathVariable int studentId){
        Student tempStudent = studentService.findById(studentId);

        if(tempStudent== null){
            throw new RuntimeException("Student id not found - "+studentId);
        }
        studentService.deleteById(studentId);

        return "Deleted student id - " + studentId;
    }

}
