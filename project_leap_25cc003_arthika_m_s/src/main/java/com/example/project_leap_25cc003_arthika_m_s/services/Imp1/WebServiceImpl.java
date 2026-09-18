package com.example.project_leap_25cc003_arthika_m_s.services.Imp1;

import com.example.project_leap_25cc003_arthika_m_s.model.Student;

import com.example.project_leap_25cc003_arthika_m_s.services.WebService;
import com.example.project_leap_25cc003_arthika_m_s.repository.WebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;






    @Service
    public class WebServiceImpl implements WebService {
        @Autowired
        WebRepository wr;


        @Override
        public Student saveStudent(Student student) {
            return wr.save(student);
        }

        @Override
        public void deleteStudent(Long id) {
            wr.deleteById(id);
        }

        @Override
        public List<Student> readStudent() {
            return wr.findAll();
        }

        @Override
        public Student updateStudent(Student student) {
            return wr.save(student);
        }
}