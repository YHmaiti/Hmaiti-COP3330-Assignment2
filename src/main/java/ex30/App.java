/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex30;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // counter will store the value totaling he number of elements printed
        // for the testing of the completion of the printing of the table
        int counter = MultiplicationTableGenerator();

    }

    public static int MultiplicationTableGenerator() {

        int i = 0, j = 0;
        int count = 0;

        for(i = 1; i <= 12; i++) {

            for (j = 1; j <= 12; j++) {

                // 6 is the width that will be used
                // 'd' will make the argument to be formatted as integer
                System.out.printf("%6d", i*j);

                count++;

            }

            System.out.print("\n");

        }

        return count;

    }

}
