package aze.iktlab.smallapp.exercise.controller;

import aze.iktlab.smallapp.exercise.model.Person;
import aze.iktlab.smallapp.exercise.services.PersonService;

import java.util.Scanner;

public class PersonController {
    private final PersonService personService;
    private final Scanner sc = new Scanner(System.in);

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void savePerson(){
        Person person = new Person();
        System.out.println("Enter name: ");
        String name = sc.next();
        person.setName(name);
        //fill fields

        personService.savePerson(person);
    }
}
