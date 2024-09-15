package com.enigma.university_spring.service;

import com.enigma.university_spring.entity.Teacher;

import java.util.List;

public interface TeacherService {
 List<Teacher> getAll();

 Teacher getById(String id);

 Teacher save(Teacher teacher);

 Teacher update(Teacher teacher);

 void deletById(String id);



}
