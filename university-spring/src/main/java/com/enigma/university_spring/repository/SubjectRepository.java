package com.enigma.university_spring.repository;

import com.enigma.university_spring.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {

}
