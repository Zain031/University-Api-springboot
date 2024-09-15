package com.enigma.university_spring.service.impl;

import com.enigma.university_spring.entity.Teacher;
import com.enigma.university_spring.repository.TeacherRepository;
import com.enigma.university_spring.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getById(String id) {

        return findByIdOrThrow(id);
    }

    @Override
    public Teacher save(Teacher teacher) {

        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        this.teacherRepository.findById(teacher.getId());
        return teacherRepository.save(teacher);

    }

    @Override
    public void deletById(String id) {
        teacherRepository.deleteById(id);

    }

    private Teacher findByIdOrThrow(String id) {
        Optional<Teacher> teacher = teacherRepository.findById(id);
        return teacher.orElseThrow(() -> new RuntimeException("Teacher not Found"));

    }

}
