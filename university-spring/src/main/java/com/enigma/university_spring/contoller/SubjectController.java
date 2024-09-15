package com.enigma.university_spring.contoller;
import com.enigma.university_spring.entity.Subject;
import com.enigma.university_spring.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class SubjectController {
    private SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService){
        this.subjectService = subjectService;
    }

    @PostMapping("/subject")
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.save(subject);
    }

    @GetMapping("/subjects")
    public List<Subject> getAllSubject() {
        return subjectService.getAll();
    }

    @GetMapping("/subject/{id}")
    public Subject getSubjectById(@PathVariable String id) {
        return subjectService.getById(id);
    }

    @PutMapping("/subject")
    public Subject updateSubject(@RequestBody Subject subject) {
        return subjectService.update(subject);
    }

    @DeleteMapping("/subject/{id}")
    public void deleteSubjectById(@PathVariable String id) {
        subjectService.deleteById(id);
    }





}
