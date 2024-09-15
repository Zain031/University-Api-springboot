package com.enigma.university_spring.service.impl;
import com.enigma.university_spring.entity.Subject;
import com.enigma.university_spring.repository.SubjectRepository;
import com.enigma.university_spring.service.SubjectService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject getById(String id) {
        return findByIdOrThrow(id);
    }

    @Override
    public Subject update(Subject subject) {
        this.subjectRepository.findById(subject.getId());
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteById(String id) {
        subjectRepository.deleteById(id);

    }

    private Subject findByIdOrThrow(String id) {
        Optional<Subject> subject = subjectRepository.findById(id);
        return subject.orElseThrow(() -> new RuntimeException("Teacher not Found"));

    }


}
