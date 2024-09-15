package com.enigma.university_spring.service.impl;

import com.enigma.university_spring.entity.Student;
import com.enigma.university_spring.repository.StudentRepository;
import com.enigma.university_spring.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

private  final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getById(String id) {
        return findByIdOrThrow(id);
    }

    @Override
    public Student update(Student student) {
       this.studentRepository.findById(student.getId());
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(String id) {
        studentRepository.deleteById(id);

    }

    private Student findByIdOrThrow(String id){
        Optional<Student> student = studentRepository.findById(id);
        return student.orElseThrow(()-> new RuntimeException("Teacher not Found"));

    }


}
