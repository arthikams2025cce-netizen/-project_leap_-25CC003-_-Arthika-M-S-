package com.example.project_leap_25cc003_arthika_m_s.services;
import com.example.project_leap_25cc003_arthika_m_s.model.Student;
import java.util.List;
public interface WebService {
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> readStudent();
    Student updateStudent(Student student);
}
