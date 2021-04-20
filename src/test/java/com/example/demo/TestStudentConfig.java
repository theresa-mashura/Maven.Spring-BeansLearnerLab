package com.example.demo;
import com.example.demo.Groups.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Qualifier("previousStudents")
    @Autowired
    private Students previousStudents;

    @Test
    public void testCurrentStudents() {
        // Arrange
        String expected = "[Student{name=Kelly,id=1}Student{name=Abiel,id=2}Student{name=Ashley,id=3}Student{name=Monali,id=4}Student{name=Ryan,id=5}]";

        // Act
        String actual = currentStudents.toString();

        // Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testPreviousStudents() {
        // Arrange
        String expected = "[Student{name=Donald,id=1}Student{name=Christina,id=2}Student{name=Eric,id=3}Student{name=Tom,id=4}Student{name=Timothy,id=5}]";

        // Act
        String actual = previousStudents.toString();

        // Assert
        Assert.assertEquals(expected, actual);
    }
}
