/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex31;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response ="";
        int restingPulse = 0, Age = 0;
        int[] TargetHeartRate = new int[9];
        int j = 0;

        System.out.print("Enter your age: ");
        response = scanner.nextLine();

        while (!response.matches("[0-9]+")){
            System.out.print("Please enter a number: ");
            response = scanner.nextLine();
        }

        Age = Integer.valueOf(response);

        System.out.print("Enter your resting pulse: ");
        response = scanner.nextLine();

        while (!response.matches("[0-9]+")){
            System.out.print("Please enter a number: ");
            response = scanner.nextLine();
        }

        restingPulse = Integer.valueOf(response);

        // calculate the Target Heart Rate
        TargetHeartRate = TargetHeartRateCalc(Age, restingPulse, TargetHeartRate);

        System.out.print("Resting Pulse: " + restingPulse + "\t\tAge: " + Age + "\n\n");

        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        j = 0;

        for (int k = 55; k <= 95; k = k + 5) {

            System.out.println(k + "%" + "          | " + TargetHeartRate[j] + " bpm");
            j = j + 1;


        }

    }

    public static int[] TargetHeartRateCalc(int Age, int restingPulse, int[]TargetHeartRate) {

        int j = 0;

        for(int i = 55; i <= 95; i = i+5) {

            TargetHeartRate[j] = (((220 - Age) - restingPulse) * i/100) + restingPulse;

            j = j + 1;


        }

        return TargetHeartRate;

    }

}
