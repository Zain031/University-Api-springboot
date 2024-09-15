package com.enigma.university_spring.repository;

import com.enigma.university_spring.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
}
