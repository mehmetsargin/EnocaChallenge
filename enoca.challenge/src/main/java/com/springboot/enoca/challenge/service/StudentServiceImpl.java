package com.springboot.enoca.challenge.service;

import com.springboot.enoca.challenge.dao.StudentRepository;
import com.springboot.enoca.challenge.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository theStudentRepository) {
        studentRepository = theStudentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student theStudent) {
        return studentRepository.save(theStudent);
    }

    @Override
    public Student findById(int theId) {
        Optional<Student> result = studentRepository.findById(theId);
        Student theStudent=null;

        if(result.isPresent()){
            theStudent=result.get();
        }
        else{
            throw new RuntimeException("Didn't find student id - "+ theId);
        }
        return theStudent;
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }
}
