package com.example.demo.Groups;

import com.example.demo.Groups.People;
import com.example.demo.Individuals.Student;

import java.util.Iterator;

public class Students extends People<Student> {

    public Students(Student... students) {
        super(students);
    }

    @Override
    public Iterator<Student> iterator() {
        return super.findAll().iterator();
    }
}
