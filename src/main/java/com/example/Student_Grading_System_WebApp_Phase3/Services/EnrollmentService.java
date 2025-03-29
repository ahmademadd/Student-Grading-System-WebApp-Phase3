package com.example.Student_Grading_System_WebApp_Phase3.Services;
import com.example.Student_Grading_System_WebApp_Phase3.DAO.EnrollmentRepository;
import com.example.Student_Grading_System_WebApp_Phase3.Models.Enrollment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public void saveEnrollment(Enrollment enrollment) {
        enrollmentRepository.save(enrollment);
    }
}
