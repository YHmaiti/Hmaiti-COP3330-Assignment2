/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("Check if the rate calculator function is valid")
    void checkRateCalculator1() {

        Assertions.assertEquals(18.00, App.RateCalculator("4"));

    }

    @Test
    @DisplayName("2nd Check if the rate calculator function is valid")
    void checkRateCalculator2() {

        Assertions.assertEquals(3.60, App.RateCalculator("20"));

    }

    @Test
    @DisplayName("3rd Check if the rate calculator function is valid")
    void checkRateCalculator3() {

        Assertions.assertEquals(5.142857142857143, App.RateCalculator("14"));

    }

}
