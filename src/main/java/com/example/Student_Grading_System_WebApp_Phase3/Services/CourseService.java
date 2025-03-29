package com.example.Student_Grading_System_WebApp_Phase3.Services;
import com.example.Student_Grading_System_WebApp_Phase3.DAO.CourseRepository;
import com.example.Student_Grading_System_WebApp_Phase3.Models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllEnrollments() {
        return courseRepository.findAll();
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }
    public Optional<Course> getById(int id) {
        return courseRepository.findById(id);
    }
}