package com.example.demo.Groups;

import com.example.demo.Individuals.Instructor;
import com.example.demo.Individuals.Student;
import com.example.demo.Individuals.Teacher;

public class Classroom {

    private Instructors instructors;
    private Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.findAll(), numberOfHours);
    }

    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");
        for(Instructor i : instructors) {
            s.append(i.getClass().getSimpleName()).append(i.toString());
        }
        for (Student st : students) {
            s.append(st.getClass().getSimpleName()).append(st.toString());
        }
        s.append("]");
        return s.toString();
    }
}
