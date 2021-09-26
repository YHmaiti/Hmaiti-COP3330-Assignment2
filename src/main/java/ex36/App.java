/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> numbers = new ArrayList<String>();
        String num = "";
        int randomIndex;
        double avg;
        double min, max;
        double stdDeviation;

        while(true){

            System.out.print("Enter a number: ");
            num = scanner.nextLine();

            while((!num.matches("[0-9.]+")) && (!num.equals("done"))) {
                System.out.print("The input entered is wrong, try again (numbers only): ");
                num = scanner.nextLine();
            }

            if (num.equals("done")) {

                break;

            }else {

                numbers.add(num);

            }

        }

        System.out.print("Numbers: ");

        if (numbers.isEmpty()){

            System.out.print("None..");
            return;

        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size()-1)
                System.out.print(numbers.get(i) + ", ");
            else
                System.out.print(numbers.get(i));
        }

        List<Double> numbersFinal = new ArrayList<Double>(numbers.size()) ;

        for (String current : numbers) {

            numbersFinal.add(Double.valueOf(current));

        }

        avg = average(numbersFinal);
        max = max(numbersFinal);
        min = min(numbersFinal);
        stdDeviation = std(numbersFinal);

        System.out.printf("\nThe average is %.2f\n", avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.printf("The standard deviation is %.2f", stdDeviation);

    }

    public static double average(List<Double> nums) {

        double sum = 0.0;
        int count = 0;

        for (Double current: nums){

            sum += current;
            count++;

        }

        return (sum / count);

    }

    public static double max(List<Double> nums) {

        return Collections.max(nums);

    }

    public static double min(List<Double> nums) {

        return Collections.min(nums);

    }

    public static double std(List<Double> nums) {

        double sum = 0.0, stDeviation = 0.0;
        int len = nums.size();

        for(double num : nums) {

            sum += num;

        }

        double mean = sum/len;

        for(double num: nums) {

            stDeviation += Math.pow(num - mean, 2);

        }

        return Math.sqrt(stDeviation/len);

    }


}
