/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("1st Check if sum calculating function is valid")
    void testSum1() {

        double[] testArray = {5,5,5,5,5};
        Assertions.assertEquals(25.0, App.sum(0, testArray, 0));

    }

    @Test
    @DisplayName("2nd Check if sum calculating function is valid")
    void testSum2() {

        double[] testArray = {1,1,1,0,0};
        Assertions.assertEquals(3.0, App.sum(0, testArray, 0));

    }

    @Test
    @DisplayName("3rd Check if sum calculating function is valid")
    void testSum3() {

        double[] testArray = {0,14,6,0,0};
        Assertions.assertEquals(20.0, App.sum(0, testArray, 0));

    }

}
