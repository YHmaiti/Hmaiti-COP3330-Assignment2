/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex32;

import java.util.*;

public class App {

    public static int attempt = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response = "";
        int level;
        int executed = 0;// integer to store 1 if the function calls were executed

        if (attempt == 0) {
            System.out.println("Let's play Guess the Number!\n");
        }

        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        response = scanner.nextLine();

        while(!response.matches("[1-3]+")){

            System.out.println("Invalid input! Please, choose either 1, 2 or 3:");
            response = scanner.nextLine();

        }

        level = Integer.valueOf(response);

        if (level == 1) {

            level1();
            executed = executedFunction(1); // for testing purpose that the function level1 was called and achieved

        }else if (level == 2) {

            level2();
            executed = executedFunction(2); // for testing purpose that the function level2 was called and achieved

        }else if (level == 3) {

            level3();
            executed = executedFunction(3); // for testing purpose that the function level3 was called and achieved

        }

        System.out.print("Do you wish to play again (Y/N)? ");

        response = scanner.nextLine();

        if (response.equals("y") || response.equals("Y")){
            System.out.print("\n");
            attempt += 1;
            main(args);
        } else {
            return;
        }

    }

    public static int getRandomNumGen(int maximum) {

        Random rand = new Random();

        int answer = rand.nextInt(maximum) + 1;

        return answer;

    }

    public static void level1(){

        Scanner scanner = new Scanner(System.in);
        int answer = getRandomNumGen(10);
        int numGuesses = 1;
        int guess = 0;
        String userEntry = "";

        System.out.print("I have my number. What's your guess? ");
        userEntry = scanner.nextLine();

        while(!userEntry.matches("[0-9]+")){
            numGuesses++;
            System.out.println("Invalid input! Please enter a number:");
            userEntry = scanner.nextLine();

        }

        guess = Integer.valueOf(userEntry);

        while(guess != answer) {
            numGuesses++;

            if(guess < answer) {
                System.out.print("Too low. Guess Again: ");
            }else if (guess > answer) {
                System.out.print("Too high. Guess Again: ");
            }
            userEntry = scanner.nextLine();

            while(!userEntry.matches("[0-9]+")){
                numGuesses++;
                System.out.println("Invalid input! Please enter a number:");
                userEntry = scanner.nextLine();

            }

            guess = Integer.valueOf(userEntry);

        }

        System.out.print("You got it in " + numGuesses + " guesses!\n\n");


    }

    public static void level2(){


        Scanner scanner = new Scanner(System.in);
        int answer = getRandomNumGen(100);
        int numGuesses = 1;
        int guess = 0;
        String userEntry = "";

        System.out.print("I have my number. What's your guess? ");
        userEntry = scanner.nextLine();

        while(!userEntry.matches("[0-9]+")){
            numGuesses++;
            System.out.println("Invalid input! Please enter a number:");
            userEntry = scanner.nextLine();

        }

        guess = Integer.valueOf(userEntry);

        while(guess != answer) {
            numGuesses++;

            if(guess < answer) {
                System.out.print("Too low. Guess Again: ");
            }else if (guess > answer) {
                System.out.print("Too high. Guess Again: ");
            }
            userEntry = scanner.nextLine();

            while(!userEntry.matches("[0-9]+")){
                numGuesses++;
                System.out.println("Invalid input! Please enter a number:");
                userEntry = scanner.nextLine();

            }

            guess = Integer.valueOf(userEntry);

        }

        System.out.print("You got it in " + numGuesses + " guesses!\n\n");

    }

    public static void level3(){


        Scanner scanner = new Scanner(System.in);
        int answer = getRandomNumGen(1000);
        int numGuesses = 1;
        int guess = 0;
        String userEntry = "";

        System.out.print("I have my number. What's your guess? ");
        userEntry = scanner.nextLine();

        while(!userEntry.matches("[0-9]+")){
            numGuesses++;
            System.out.println("Invalid input! Please enter a number:");
            userEntry = scanner.nextLine();

        }

        guess = Integer.valueOf(userEntry);

        while(guess != answer) {
            numGuesses++;

            if(guess < answer) {
                System.out.print("Too low. Guess Again: ");
            }else if (guess > answer) {
                System.out.print("Too high. Guess Again: ");
            }
            userEntry = scanner.nextLine();

            while(!userEntry.matches("[0-9]+")){
                numGuesses++;
                System.out.println("Invalid input! Please enter a number:");
                userEntry = scanner.nextLine();

            }

            guess = Integer.valueOf(userEntry);

        }

        System.out.print("You got it in " + numGuesses + " guesses!\n\n");


    }

    // function used for testing as described in main
    public static int executedFunction( int recieved) {
        return recieved + 3;
    }
}
