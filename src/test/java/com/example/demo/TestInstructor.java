package com.example.demo;

import com.example.demo.Individuals.Instructor;
import com.example.demo.Individuals.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestInstructor {

    @Test
    public void testTeach(){
        // Given
        Instructor i = new Instructor(1L, "Teacher");
        Student s1 = new Student(2L, "Student");

        // When
        i.teach(s1, 2);
        double actualStudyTime = s1.getTotalStudyTime();

        // Then
        Assert.assertEquals(2L, actualStudyTime, .0001);

    }

    @Test
    public void testLecture() {
        // Given
        ArrayList<Student> l = new ArrayList<Student>();
        Instructor i = new Instructor(1L, "Teacher");
        l.add(new Student(2L, "Student"));
        l.add(new Student(3L, "APlusStudent"));
        l.add(new Student(4L, "APlusPlusStudent"));

        // When
        i.lecture(l, 4);
        double actualStudyTimeS1 = l.get(0).getTotalStudyTime();
        double actualStudyTimeS2 = l.get(1).getTotalStudyTime();
        double actualStudyTimeS3 = l.get(2).getTotalStudyTime();

        // Then
        Assert.assertEquals(4.0/3.0, actualStudyTimeS1, .0001);
        Assert.assertEquals(4.0/3.0, actualStudyTimeS2, .0001);
        Assert.assertEquals(4.0/3.0, actualStudyTimeS3, .0001);

    }
}
