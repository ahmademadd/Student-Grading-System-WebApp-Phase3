package com.example.Student_Grading_System_WebApp_Phase3.Models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(name = "password_hash")
    private String passwordHash;

    public Student(int student_id, String name, String email, String passwordHash) {
        this.student_id = student_id;
        this.name = name;
        this.email = email;
        this.passwordHash = hashPassword(passwordHash);
    }

    private String hashPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public String getPasswordHash() {
        return passwordHash;
    }

}
