package com.enigma.university_spring.service;

import com.enigma.university_spring.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student save(Student student);

    Student getById( String id);

    Student update(Student student);

    void deleteById(String id);








}
