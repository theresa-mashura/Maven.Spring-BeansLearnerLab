package com.example.demo.Configs;

import com.example.demo.Groups.Students;
import com.example.demo.Individuals.Student;
import org.springframework.context.annotation.Bean;

public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
                new Student(1, "Kelly"),
                new Student(2, "Abiel"),
                new Student(3, "Ashley"),
                new Student(4, "Monali"),
                new Student(5, "Ryan"),
                new Student(6, "Mike"),
                new Student(7, "Greg"),
                new Student(8, "Hazel"),
                new Student(9, "Lena"),
                new Student(10, "Theresa"),
                new Student(11, "Xiong"),
                new Student(12, "Chris"),
                new Student(13, "Justin"),
                new Student(14, "Jorge")
        );
    }

    @Bean
    public Students previousStudents() {
        return new Students(
                new Student(1, "Donald"),
                new Student(2, "Christina"),
                new Student(3, "Eric"),
                new Student(4, "Tom"),
                new Student(5, "Timothy"),
                new Student(6, "Lisa"),
                new Student(7, "George"),
                new Student(8, "Harry"),
                new Student(9, "Lauren"),
                new Student(10, "Monica"),
                new Student(11, "Robert"),
                new Student(12, "Tina"),
                new Student(13, "Jason"),
                new Student(14, "Dan")
        );
    }

}
