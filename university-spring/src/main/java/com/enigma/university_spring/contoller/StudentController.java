package com.enigma.university_spring.contoller;
import com.enigma.university_spring.entity.Student;
import com.enigma.university_spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.getAll();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getById(id);
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.update(student);
    }



    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable String id) {
        studentService.deleteById(id);
    }

}
