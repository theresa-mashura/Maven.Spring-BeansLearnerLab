package com.example.demo.Groups;

import com.example.demo.Individuals.Instructor;
import com.example.demo.Individuals.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Qualifier("previousStudents")
    private Students previousStudents;

    @Qualifier("instructors")
    private Instructors instructors;

    @Autowired
    public Alumni (Students previousStudents, Instructors instructors) {
        this.previousStudents = previousStudents;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp() {
        double instructorHrs = (1200.0/2 * previousStudents.size()) / instructors.size();
        for (Instructor i : instructors) {
            i.lecture(previousStudents, instructorHrs);
        }

    }

    public Students getPreviousStudents() {
        return this.previousStudents;
    }

    public Instructors getInstructors() {
        return this.instructors;
    }
}
