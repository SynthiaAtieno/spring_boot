package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        "Synthia Ondeng",
                        "ondengsynthia222@gmail.com",
                        1L,
                        LocalDate.of(1998, Month.JANUARY,13),
                        30


                )
        );
    }
}
