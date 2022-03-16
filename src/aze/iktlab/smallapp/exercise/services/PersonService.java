package aze.iktlab.smallapp.exercise.services;

import aze.iktlab.smallapp.exercise.dao.PersonDao;
import aze.iktlab.smallapp.exercise.model.Person;

import java.sql.SQLException;

public class PersonService {
    private final PersonDao dao;

    public PersonService(PersonDao dao) {
        this.dao = dao;
    }

    public void savePerson(Person person){
        if (person.getName().length()<3){
            System.out.println("Preson name cant be completivily");
            return;
        }
        //all checks must be here
        try {
            dao.save(person);
            System.out.println("Person succesfully saved " );
        } catch (SQLException e) {
            System.out.println("Error occured when save person");
            System.out.printf("Error message %s", e.getMessage());
            e.printStackTrace();
        }
    }
}
