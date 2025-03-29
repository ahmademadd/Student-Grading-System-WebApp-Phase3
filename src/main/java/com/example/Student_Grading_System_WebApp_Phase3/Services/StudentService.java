package com.example.Student_Grading_System_WebApp_Phase3.Services;
import com.example.Student_Grading_System_WebApp_Phase3.DAO.StudentRepository;
import com.example.Student_Grading_System_WebApp_Phase3.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void saveUser(Student student) {
        studentRepository.save(student);
    }

    public Optional<Student> getById(int Id) {
        return studentRepository.findById(Id);
    }
}
