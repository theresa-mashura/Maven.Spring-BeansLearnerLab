package com.example.demo.Configs;

import com.example.demo.Groups.Students;
import com.example.demo.Individuals.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
                new Student(1, "Kelly"),
                new Student(2, "Abiel"),
                new Student(3, "Ashley"),
                new Student(4, "Monali"),
                new Student(5, "Ryan")
        );
    }

    @Bean
    public Students previousStudents() {
        return new Students(
                new Student(1, "Donald"),
                new Student(2, "Christina"),
                new Student(3, "Eric"),
                new Student(4, "Tom"),
                new Student(5, "Timothy")
        );
    }

}
