package com.example.Student_Grading_System_WebApp_Phase3.DAO;
import com.example.Student_Grading_System_WebApp_Phase3.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);
}
