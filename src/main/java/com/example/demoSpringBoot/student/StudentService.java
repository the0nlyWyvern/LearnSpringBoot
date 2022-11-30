package com.example.demoSpringBoot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudent() {
        return List.of(new Student(1L, "Kiet", "kiet@email.com",
                LocalDate.of(2001, Month.AUGUST, 7), 21));
    }
}
