/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex24;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1 = "";
        String s2 = "";

        boolean Anagram;

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        s1 = scanner.nextLine();
        s1 = s1.toLowerCase(Locale.ROOT);

        System.out.print("Enter the second string: ");
        s2 = scanner.nextLine();
        s2 = s2.toLowerCase(Locale.ROOT);

        if (s1.length() != s2.length()) {
            Anagram = false;
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", s1, s2);
            return;
        }

        Anagram = isAnagram(s1, s2);

        if(Anagram == true) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", s1, s2);
            return;
        }else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", s1, s2);
            return;
        }

    }

    public static boolean isAnagram(String string1, String string2) {

        char str1[] = string1.toCharArray();
        char str2[] = string2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < str1.length; i++) {

            if (str1[i] != str2[i]) {

                return false;

            }

        }

        return true;

    }

}
