package com.example.demo.Individuals;

import java.util.stream.StreamSupport;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = (int) StreamSupport.stream(learners.spliterator(), false).count();
        learners.forEach( (learner) -> learner.learn( (numberOfHours / count) ));
    }
}
