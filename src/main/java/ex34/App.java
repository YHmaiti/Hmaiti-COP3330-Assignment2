/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> employees = new ArrayList<String>();
        List<String> newListUpdated = new ArrayList<>();
        String name = "";

        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println("There are 5 employees:");

        for(int i = 0; i < 5; i++){

            System.out.println(employees.get(i));

        }

        System.out.print("\nEnter an employee name to remove: ");
        name = scanner.nextLine();

        while(!employees.contains(name)){

            System.out.print("The employee name entered is not within the list, try again: ");
            name = scanner.nextLine();

        }

        newListUpdated = employeeManager(employees, name);

        for(int j = 0; j < 4; j++){

            System.out.println(newListUpdated.get(j));

        }

    }

    public static List employeeManager(List employees, String name) {

        employees.remove(name);

        System.out.println("\nThere are 4 employees: ");

        return employees;

    }

}
