/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<String>();
        String name = "";
        int randomIndex;

        while(true){

            System.out.print("Enter a name: ");
            name = scanner.nextLine();

            if (name.equals("")) {

                break;

            }else {

                names.add(name);

            }

        }


        int index = winnerAnnouncer(names);

        System.out.print("The winner is... " + names.get(index) + ".");

    }

    public static int winnerAnnouncer(List names){

        Random rand = new Random();

        int randomIndex = rand.nextInt(names.size());


        return randomIndex;
    }

}
