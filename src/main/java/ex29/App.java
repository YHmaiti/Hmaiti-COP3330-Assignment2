/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex29;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        double rateFinal = 0.0;

        System.out.print("What is the rate of return? ");
        input = scanner.nextLine();

        while (!input.matches("[0-9]+") || (input.matches("[0]+"))) {
            System.out.println("Sorry. That's not a valid input.");
            System.out.print("What is the rate of return? ");
            input = scanner.nextLine();
        }

        rateFinal = RateCalculator(input);

        System.out.printf("It will take %.2f years to double your initial investment.",rateFinal);

    }

    public static double RateCalculator(String input) {

        double rate = 0.0;
        double years = 0.0;

        rate = Double.valueOf(input);

        years = 72/rate;

        return years;

    }

}
