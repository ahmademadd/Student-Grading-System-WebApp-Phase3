package com.example.Student_Grading_System_WebApp_Phase3.Models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_id;
    private String course_name;
    private String course_code;

    public Course(){}

    public Course(int courseId, String courseName, String courseCode) {
        course_id = courseId;
        course_name = courseName;
        course_code = courseCode;
    }
}

