package com.example.project_leap_25cc003_arthika_m_s.Controller;

import com.example.project_leap_25cc003_arthika_m_s.model.Student;
import com.example.project_leap_25cc003_arthika_m_s.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class WebController {
    @Autowired
private WebService ws;
    // CREATE / SAVE STUDENT
    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return ws.saveStudent(student);
    }

    // READ ALL STUDENTS
    @GetMapping("/student")
    public List<Student> readStudent() {
        return ws.readStudent();
    }

    // UPDATE STUDENT
    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        return ws.updateStudent(student);
    }

    // DELETE STUDENT
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Long id) {
        ws.deleteStudent(id);
        return "Student deleted successfully";
    }
    
}

