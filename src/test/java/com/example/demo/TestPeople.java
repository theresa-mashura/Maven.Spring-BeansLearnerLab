package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {

    @Test
    public void testConstructor() {
        // Given
        Student s1 = new Student(1L, "Theresa");
        Student s2 = new Student(2L, "Joey");
        Student s3 = new Student(3L, "Mary");

        // When
        Students students = new Students(s1, s2, s3);

        // Then
        Assert.assertNotNull(students.findById(1L));
        Assert.assertNotNull(students.findById(2L));
        Assert.assertNotNull(students.findById(3L));
    }

    @Test
    public void testAdd(){
        // Given
        Student s1 = new Student(1L, "Theresa");
        Students students = new Students();

        // When
        students.add(s1);

        // Then
        Assert.assertEquals(1, students.findAll().size());

    }

    @Test
    public void testRemove(){
        // Given
        Student s1 = new Student(1L, "Theresa");
        Students students = new Students();

        // When
        students.add(s1);
        students.remove(s1);

        // Then
        Assert.assertEquals(0, students.findAll().size());

    }

    @Test
    public void testSize(){
        // Given
        Student s1 = new Student(1L, "Theresa");
        Student s2 = new Student(2L, "Joey");
        Students students = new Students();

        // When
        students.add(s1);
        students.add(s2);

        // Then
        Assert.assertEquals(2, students.size());

    }

    @Test
    public void testClear(){
        // Given
        Student s1 = new Student(1L, "Theresa");
        Student s2 = new Student(2L, "Joey");
        Students students = new Students();

        // When
        students.add(s1);
        students.add(s2);
        students.clear();

        // Then
        Assert.assertEquals(0, students.size());

    }

    @Test
    public void testAddAll(){
        // Given
        Student s1 = new Student(1L, "Theresa");
        Student s2 = new Student(2L, "Joey");
        Student s3 = new Student(3L, "Mary");
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Students students = new Students();

        // When
        students.addAll(list);

        // Then
        Assert.assertEquals(3, students.size());
    }

    @Test
    public void testFindById(){
        // Given
        Student s1 = new Student(1L, "Theresa");
        Student s2 = new Student(2L, "Joey");
        Student s3 = new Student(3L, "Mary");
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Students students = new Students();

        // When
        students.addAll(list);
        Student actual1 = students.findById(1L);
        Student actual2 = students.findById(3L);

        // Then
        Assert.assertEquals(1L, (long) actual1.getId());
        Assert.assertEquals(3L, (long) actual2.getId());
    }

    @Test
    public void testFindAll(){
        // Given
        Student s1 = new Student(1L, "Theresa");
        Student s2 = new Student(2L, "Joey");
        Students students = new Students();

        // When
        students.add(s1);
        students.add(s2);
        List<Student> actual = students.findAll();

        // Then
        Assert.assertEquals(2, actual.size());

    }
}
