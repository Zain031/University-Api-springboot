package com.enigma.university_spring.contoller;
import com.enigma.university_spring.entity.Teacher;
import com.enigma.university_spring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TeacherController {
    private TeacherService teacherService;

    @Autowired()
    public TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @PostMapping("/teacher")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @GetMapping("/teachers")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAll();
    }

    @GetMapping("/teacher/{id}")
    public Teacher getTeacherById(@PathVariable String id) {
        return teacherService.getById(id);
    }

    @PutMapping("/teacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.update(teacher);
    }

    @DeleteMapping("/teacher/{id}")
    public void deleteTeacherById(@PathVariable String id) {
        teacherService.deletById(id);
    }

}
