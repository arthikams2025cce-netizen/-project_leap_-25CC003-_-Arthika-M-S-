package com.example.project_leap_25cc003_arthika_m_s.repository;
import com.example.project_leap_25cc003_arthika_m_s.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebRepository extends JpaRepository<Student, Long> {

}
