package com.springboot.enoca.challenge.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_department")
    private int id_department;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "department" ,fetch = FetchType.LAZY,cascade = CascadeType.MERGE,orphanRemoval = true)
    private List<Student> studentList;

    public Department() {
    }

    public Department(int id_department, String name, List<Student> studentList) {
        this.id_department = id_department;
        this.name = name;
        this.studentList = studentList;
    }

    public int getId_department() {
        return id_department;
    }

    public void setId_department(int id_department) {
        this.id_department = id_department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id_department=" + id_department +
                ", name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
