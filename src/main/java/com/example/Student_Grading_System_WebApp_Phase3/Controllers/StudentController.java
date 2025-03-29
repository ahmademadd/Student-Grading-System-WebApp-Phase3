package com.example.Student_Grading_System_WebApp_Phase3.Controllers;
import com.example.Student_Grading_System_WebApp_Phase3.Models.Enrollment;
import com.example.Student_Grading_System_WebApp_Phase3.Services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping("/dashboard")
    public String loginPage(Model model) {
        List<Enrollment> list = enrollmentService.getAllEnrollments();
        model.addAttribute("enrollments", list);
        return "dashboard";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}