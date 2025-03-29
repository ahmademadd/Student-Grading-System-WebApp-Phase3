package com.example.Student_Grading_System_WebApp_Phase3.Services;
import com.example.Student_Grading_System_WebApp_Phase3.DAO.StudentRepository;
import com.example.Student_Grading_System_WebApp_Phase3.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private StudentRepository studentRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public boolean authenticateUser(String email, String rawPassword) {
        Student student = studentRepository.findByEmail(email);

        if (student != null) {
            return passwordEncoder.matches(rawPassword, student.getPasswordHash());
        }
        return false;
    }
}