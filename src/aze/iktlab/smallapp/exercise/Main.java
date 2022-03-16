package aze.iktlab.smallapp.exercise;

import aze.iktlab.smallapp.exercise.controller.PersonController;
import aze.iktlab.smallapp.exercise.dao.PersonDao;
import aze.iktlab.smallapp.exercise.services.PersonService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello guys");
        Scanner sc = new Scanner(System.in);
        PersonDao personDao = new PersonDao();
        PersonService personService = new PersonService(personDao);
        PersonController personController = new PersonController(personService);
        while (true){
            System.out.println("Commands: \n" +
                    "sp - Save person\n" +
                    "ru - Register User\n" +
                    "shp - show people\n" +
                    "exit - Exit");
            System.out.println("Enter command");
            String command  = sc.nextLine();
            switch (command){
                case "sp": personController.savePerson();
                    break;
                case "exit": return;

            }
            System.out.println("Goodbye");

        }
    }
}
