package com.example.appweb.controller;

import com.example.appweb.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Controller {

    private List<Person> persons = new ArrayList<>();
    private int id = 0;

    public Person findPerson(String name) {
        for (Person p : persons) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;

    }

    public Person addPerson(String name, String genero) {
        Person person = new Person();
        person.setName(name);
        person.setGenero(genero);
        id++;
        person.setId(id);
        persons.add(person);
        return person;
    }

    public void deletePerson(String name) {
        Person person = findPerson(name);
        if (person != null) {
            persons.remove(person);
        }

    }

    public Person editPerson(String name, String genero) {
        Person person = findPerson(name);
        if (person != null) {
        person.setGenero(genero);
        return person;

        }
        return null;
    }
}




