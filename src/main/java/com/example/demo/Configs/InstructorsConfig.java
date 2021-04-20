package com.example.demo.Configs;

import com.example.demo.Groups.Instructors;
import com.example.demo.Individuals.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors(
                new Instructor(1L, "Jonathan"),
                new Instructor(2L, "Sam"),
                new Instructor(3L, "Eldrith"),
                new Instructor(4L, "Tom")
        );
    }

    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors(
                new Instructor(1L, "Daniel"),
                new Instructor(2L, "Timothy"),
                new Instructor(3L, "Michael"),
                new Instructor(4L, "Phillip")
        );
    }

    @Bean
    @Primary
    public Instructors instructors() {
        return new Instructors(
                new Instructor(1L, "Kris"),
                new Instructor(2L, "Dolio"),
                new Instructor(3L, "Nobles")
        );
    }

}
