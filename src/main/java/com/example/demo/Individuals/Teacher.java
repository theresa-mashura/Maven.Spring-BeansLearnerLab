package com.example.demo.Individuals;

import com.example.demo.Individuals.Learner;

public interface Teacher {

    void teach(Learner learner, double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);
}
