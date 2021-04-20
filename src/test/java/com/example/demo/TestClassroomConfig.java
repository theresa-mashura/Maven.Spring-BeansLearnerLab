package com.example.demo;

import com.example.demo.Groups.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void testPreviousCohort() {
        // Arrange
        String expected = "[Instructor{name=Kris,id=1}Instructor{name=Dolio,id=2}Instructor{name=Nobles,id=3}Student{name=Kelly,id=1}Student{name=Abiel,id=2}Student{name=Ashley,id=3}Student{name=Monali,id=4}Student{name=Ryan,id=5}]";

        // Act
        String actual = currentCohort.toString();

        // Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCurrentCohort() {
        // Arrange
        String expected = "[Instructor{name=Kris,id=1}Instructor{name=Dolio,id=2}Instructor{name=Nobles,id=3}Student{name=Donald,id=1}Student{name=Christina,id=2}Student{name=Eric,id=3}Student{name=Tom,id=4}Student{name=Timothy,id=5}]";

        // Act
        String actual = previousCohort.toString();

        // Assert
        Assert.assertEquals(expected, actual);
    }

}

