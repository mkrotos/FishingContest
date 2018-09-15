package com.krotos.views;

import com.krotos.PersonDAO;
import com.krotos.services.PersonDAOService;
import com.krotos.services.Tournament;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestUI {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final PersonDAO PERSON_DAO = new PersonDAO();
    private static final PersonDAOService PERSON_DAO_SERVICE = new PersonDAOService(PERSON_DAO);
    //mapa <nazwa turnieju, turniej>
    private static final Map<String, Tournament> mapOfTournaments = new HashMap<>();

    public static void start() {
        boolean run = true;
        while (run) {
            System.out.println("\nWhat you want to do? \n" +
                    "1 - add person \n" +
                    "2 - show list of people \n" +
                    "3 - add tournament \n" +
                    "4 - go to tournament UI \n" +
                    "5 - exit");

            int choice = SCANNER.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Type id:");
                    long id = SCANNER.nextLong();
                    System.out.println("Type name:");
                    String name = SCANNER.next();
                    System.out.println("Type surname");
                    String surname = SCANNER.next();
                    PERSON_DAO.addPerson(id,name, surname);
                    System.out.println("Person added.");
                    break;
                case 2:
                    System.out.println("List of people");
                    PERSON_DAO_SERVICE.dispList();
                    break;
                case 3:
                    System.out.println("Nothing yet");

                    break;
                case 4:
                    System.out.println("Nothing yet");
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("No such action");
                    break;
            }

        }
        System.out.println("Bye");
    }
}
