package com.example.demo.Groups;

import com.example.demo.Individuals.Person;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    private List<PersonType> personList = new ArrayList<PersonType>();

    @SafeVarargs
    public People(PersonType...people) {
        for(PersonType p : people) {
            personList.add(p);
        }
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size(){
        return this.personList.size();
    }

    public void clear() {
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> peopleToAdd) {
        peopleToAdd.forEach( (person) -> this.personList.add(person) );
    }

    public PersonType findById(long id) {
        return personList.stream().filter( (person) -> person.getId() == id).findFirst().orElse(null);
    }

    public List<PersonType> findAll() {
        return this.personList;
    }
}
