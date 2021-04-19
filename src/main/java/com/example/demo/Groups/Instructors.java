package com.example.demo.Groups;

import com.example.demo.Individuals.Instructor;

import java.util.Iterator;

public class Instructors extends People<Instructor> {

    public Instructors(Instructor...instructors) {
        super(instructors);
    }

    public Iterator<Instructor> iterator() {
        return super.findAll().iterator();
    }
}
