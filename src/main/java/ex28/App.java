/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex28;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        double[] numbers = new double[5];
        double sum = 0.0;

        for (int j = 0; j < 5; j++){
            System.out.print("Enter a number: ");
            numbers[j] = scanner.nextDouble();
        }

        sum = sum(i, numbers, sum);

        System.out.print("The total is " + sum + ".");


    }

    public static double sum(int i, double[] numbers, double sum) {


        for (i = 0; i < 5; i++) {

            sum += numbers[i];

        }

        return sum;

    }

}
