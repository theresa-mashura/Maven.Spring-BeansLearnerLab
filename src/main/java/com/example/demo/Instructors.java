package com.example.demo;

import java.util.Iterator;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor...instructors) {
        super(instructors);
    }

    public Iterator<Instructor> iterator() {
        return super.findAll().iterator();
    }
}
