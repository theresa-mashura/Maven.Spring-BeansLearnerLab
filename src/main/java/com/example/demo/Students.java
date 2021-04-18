package com.example.demo;

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
