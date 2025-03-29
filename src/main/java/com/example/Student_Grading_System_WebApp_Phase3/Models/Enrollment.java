package com.example.Student_Grading_System_WebApp_Phase3.Models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int enrollment_id;
    private int student_id;
    private int course_id;
    private Double grade;
//
//    private Optional<Student> student;
//    private Optional<Course> course;

    public Enrollment(int enrollment_id, int student_id, int course_id, Double grade) {
        this.enrollment_id = enrollment_id;
        this.student_id = student_id;
        this.course_id = course_id;
        this.grade = grade;
//        StudentService studentService = new StudentService();
//        student = studentService.getById(student_id);
//        CourseService courseService = new CourseService();
//        course = courseService.getById(course_id);

    }
}