/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex38;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    @DisplayName("check whether the numbers were filtered to just even numbers or no")
    public void filterEvenNumbers() {

        int[] nums = { 2, 4, 6, 8};
        int[] tobeFiltered = { 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Integer[] tobeTested = App.filterEvenNumbers(tobeFiltered);

        int[] tobetested2 = new int[tobeTested.length];

        int i = 0;
        for (Integer e : tobeTested)
            tobetested2[i++] = e;

         Assertions.assertArrayEquals( nums, tobetested2 );

    }

}

