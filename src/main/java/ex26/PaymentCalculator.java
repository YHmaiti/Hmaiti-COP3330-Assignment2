/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex26;

import java.util.Scanner;

public class PaymentCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int months;
        double balance;
        double APR;
        double monthlyPayment;

        System.out.print("What is your balance? ");
        balance = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        APR = scanner.nextDouble();

        while (APR < 1) {

            System.out.print("Please, enter the APR as a percentage: ");
            APR = scanner.nextDouble();

        }

        APR = APR / 100;

        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = scanner.nextDouble();

        months = calculateMonthsUntilPaidOff(balance, monthlyPayment, APR);

        System.out.print("It will take you "+months+" months to pay off this card.");


    }

    public static int calculateMonthsUntilPaidOff(double balance, double monthlyPayment, double APR) {

        APR = APR / 365;

        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / monthlyPayment * (1 - Math.pow(1 + APR, 30))) / Math.log(1 + APR));

    }

}
