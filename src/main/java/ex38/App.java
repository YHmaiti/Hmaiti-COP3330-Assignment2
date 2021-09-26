/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of numbers, seperated by spaces: ");
        String numbers = scanner.nextLine();

        String[] numArray = numbers.split(" ");

        int size = numArray.length;
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {

            arr[i] = Integer.parseInt(numArray[i]);

        }

        Integer[] newArray = filterEvenNumbers(arr);

        System.out.print("The even numbers are");

        for(int j = 0; j < newArray.length; j++) {

            System.out.print(" " + newArray[j]);

        }
        System.out.print(".");

    }

    public static Integer[] filterEvenNumbers(int[] arr) {

        List<Integer> filteredNums = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                filteredNums.add(arr[i]);
            else
                continue;
        }

        Integer[] returnArr = new Integer[filteredNums.size()];
        returnArr = filteredNums.toArray(returnArr);

        return returnArr;
    }

}
