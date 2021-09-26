/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */


package ex30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("Check that the multiplication table was printed by checking that counter reached 12*12 value")
    public void CheckThatMultiplicationTableWasGenerated() {

        Assertions.assertEquals(144, App.MultiplicationTableGenerator());

    }


}
