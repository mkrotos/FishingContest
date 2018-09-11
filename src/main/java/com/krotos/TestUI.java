package com.krotos;

import com.krotos.domain.PersonList;
import com.krotos.domain.Tournament;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestUI {

    private static final Scanner scanner = new Scanner(System.in);
    private static final PersonList personList = new PersonList();
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

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Type name:");
                    String name = scanner.next();
                    System.out.println("Type surname");
                    String surname = scanner.next();
                    personList.addPerson(name, surname);
                    System.out.println("Person added.");
                    break;
                case 2:
                    System.out.println("List of people");
                    personList.printList();
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
