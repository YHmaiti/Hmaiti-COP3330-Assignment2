/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex27;

import java.util.Scanner;
import java.util.regex.*;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        String zip = "";
        String ID = "";
        int returnvalue;

        System.out.print("Enter the first name: ");
        firstName = input.nextLine();

        System.out.print("Enter the last name: ");
        lastName = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        zip = input.nextLine();

        System.out.print("Enter the employee ID: ");
        ID = input.nextLine();

        returnvalue = validateInput(firstName, lastName, zip, ID);

        System.out.print(output);

    }

    public static String output = "";

    public static int  validateInput(String firstName, String lastName, String zip, String empID) {

        boolean valid1 = validateFirstName(firstName);
        boolean valid2 = validateLastName(lastName);
        boolean valid3 = validateEmployeeID(empID);
        boolean valid4 = validateZipCode(zip);

        if (valid4 && valid3 && valid2 && valid1) {

            output = "There were no errors found.";

        }

        return 1;

    }

    public static boolean validateEmployeeID(String empID) {

        String charactersNeeded = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        boolean valid = true;

        if (!Pattern.matches(charactersNeeded, empID)) {

            output += "The employee ID must be in the format of AA-1234.\n";
            valid = false;

            return valid;

        }

        return valid;

    }

    public static boolean validateFirstName(String firstName) {

        boolean isvalid = true;

        if (firstName.length() < 2) {

            output += "The first name must be at least 2 characters long.\n";
            isvalid = false;

        }
        if (firstName.length() == 0) {

            output += "The first name must be filled in.\n";
            isvalid = false;

        }

        return isvalid;

    }


    public static boolean validateLastName(String lastName) {

        boolean isvalid = true;

        if (lastName.length() < 2) {

            output += "The last name must be at least 2 characters long.\n";
            isvalid = false;

        }
        if (lastName.length() == 0) {

            output += "The last name must be filled in.\n";
            isvalid = false;

        }

        return isvalid;

    }

    public static boolean validateZipCode(String zip) {

        boolean valid = true;

        try {

            int Zip = Integer.parseInt(zip);

            if (zip.length() != 5) {

                output += "The zipcode must be a 5 digit number.";
                valid = false;

            }

        } catch (Exception e) {

            output += "The zipcode must be a 5 digit number.";
            valid = false;

        }

        return valid;

    }

}
