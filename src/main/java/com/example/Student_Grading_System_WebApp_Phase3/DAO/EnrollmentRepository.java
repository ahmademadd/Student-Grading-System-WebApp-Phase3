package com.example.Student_Grading_System_WebApp_Phase3.DAO;
import com.example.Student_Grading_System_WebApp_Phase3.Models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

}
