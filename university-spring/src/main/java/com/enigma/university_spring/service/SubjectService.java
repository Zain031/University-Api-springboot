package com.enigma.university_spring.service;

import com.enigma.university_spring.entity.Student;
import com.enigma.university_spring.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAll();

    Subject save(Subject subject);

    Subject getById( String id);

    Subject update(Subject subject);

    void deleteById(String id);




}
