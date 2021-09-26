/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */


package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AppTest {

    @Test
    @DisplayName("Check if the generated values are correct and that an integer array is returned")
    public void targetHeartRateCalc() {

        int Age = 22;
        int restingPulse = 65;
        int[] Target = new int[9];
        int[] ResulTFromFunction = new int[9];
        int[]TargetHeartRate  =new int[9];
        int j = 0;

        for(int i = 55; i <= 95; i = i+5) {

            TargetHeartRate[j] = (((220 - Age) - restingPulse) * i/100) + restingPulse;

            j = j + 1;


        }

        ResulTFromFunction = App.TargetHeartRateCalc(22, 65, Target);
        Assertions.assertTrue(Arrays.equals(TargetHeartRate, ResulTFromFunction));

    }


}
