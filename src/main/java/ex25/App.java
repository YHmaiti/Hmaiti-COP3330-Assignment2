/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex25;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String pass = "";
        String outputMsg = "";
        int secureDegree;

        System.out.println("Enter The Password to Evaluate: ");
        pass = scanner.nextLine();

        secureDegree = passwordValidator(pass);

        if (secureDegree == 1) {
            outputMsg = "The password '" + pass + "' is a very weak password.";
        }else if(secureDegree == 2) {
            outputMsg = "The password '" + pass + "' is a weak password.";
        }else if(secureDegree == 3) {
            outputMsg = "The password '" + pass + "' is a strong password.";
        }else if(secureDegree == 4) {
            outputMsg = "The password '" + pass + "' is a very strong password.";
        }

        System.out.print(outputMsg);

    }

    public static int passwordValidator(String password) {

        if((password.matches("[0-9]+")) && (password.length() < 8)) {
            return 1;
        }else if((password.length() < 8) && (password.matches("[a-zA-Z]+"))) {
            return 2;
        }else if((password.length() >= 8) && (password.matches("[A-Za-z0-9]+"))){
            return 3;
        }

        return 4;
    }

}
