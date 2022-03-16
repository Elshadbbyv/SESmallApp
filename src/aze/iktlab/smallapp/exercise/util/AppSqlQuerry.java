package aze.iktlab.smallapp.exercise.util;

import aze.iktlab.smallapp.exercise.model.Person;

public class AppSqlQuerry {
    public static String insertPerson(Person person){
        return "INSERT INTO PERSON(NAME, ..) VALUES ('%S')";


    }
}
