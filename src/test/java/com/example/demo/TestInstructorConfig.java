package com.example.demo;

import com.example.demo.Groups.Instructors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Test
    public void testTcUsaInstructors() {
        // Arrange
        String expected = "[Instructor{name=Jonathan,id=1}Instructor{name=Sam,id=2}Instructor{name=Eldrith,id=3}Instructor{name=Tom,id=4}]";

        // Act
        String actual = tcUsaInstructors.toString();
        System.out.println(actual);

        // Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testTcUkInstructors() {
        // Arrange
        String expected = "[Instructor{name=Daniel,id=1}Instructor{name=Timothy,id=2}Instructor{name=Michael,id=3}Instructor{name=Phillip,id=4}]";

        // Act
        String actual = tcUkInstructors.toString();
        System.out.println(actual);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstructors() {
        // Arrange
        String expected = "[Instructor{name=Kris,id=1}Instructor{name=Dolio,id=2}Instructor{name=Nobles,id=3}]";

        // Act
        String actual = instructors.toString();
        System.out.println(actual);

        // Assert
        Assert.assertEquals(expected, actual);
    }

}
