/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex33;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Random rand = new Random();

        Scanner scanner = new Scanner(System.in);
        int randIndex;

        List<String> answers = new ArrayList<String>();
        answers.add("Yes,");
        answers.add("No,");
        answers.add("Maybe,");
        answers.add("Ask again later.");

        System.out.println("What's your question? ");
        System.out.print("> ");
        String response = scanner.nextLine();

        randIndex = rand.nextInt(4);

        int achievedornot = magicAnswer(answers, randIndex);

    }

    public static int magicAnswer(List answers, int randIndex) {


        System.out.print("\n" + answers.get(randIndex));

        return 1; // for testing purpose signifies that the function was executed and achieved

    }

}
