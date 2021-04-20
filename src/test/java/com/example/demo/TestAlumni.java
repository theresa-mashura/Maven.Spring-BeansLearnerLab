package com.example.demo;

import com.example.demo.Groups.Alumni;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestAlumni {

    @Autowired
    Alumni alumni;

    @Test
    public void testExecuteBootcamp() {
        // Arrange
        double expectedHrsPerInstructor = 2000;

        // Act
        alumni.executeBootcamp();
        double actualHrsPerInstructor = ((1200.0) * alumni.getPreviousStudents().size()) / alumni.getInstructors().size();

        // Assert
        Assert.assertEquals(1200, alumni.getPreviousStudents().findById(1).getTotalStudyTime(), 0.001);
        Assert.assertEquals(1200, alumni.getPreviousStudents().findById(2).getTotalStudyTime(), 0.001);
        Assert.assertEquals(1200, alumni.getPreviousStudents().findById(3).getTotalStudyTime(), 0.001);
        Assert.assertEquals(1200, alumni.getPreviousStudents().findById(4).getTotalStudyTime(), 0.001);
        Assert.assertEquals(1200, alumni.getPreviousStudents().findById(5).getTotalStudyTime(), 0.001);
        Assert.assertEquals(expectedHrsPerInstructor, actualHrsPerInstructor, .001);
    }

}
