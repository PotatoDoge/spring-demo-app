package com.example.demo.student;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// service layer
@Service // this tells the code that this Service can be autowired
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(1L,"Mariam","example@gmail.com", LocalDate.of(2000, Month.JANUARY,5),21));
    }
}
