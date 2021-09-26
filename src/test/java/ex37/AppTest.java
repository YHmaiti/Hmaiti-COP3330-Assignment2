/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("Check if the generated password matches the passed criteria to the function by catching a return of 1")
    public void passGenerator() {

        Assertions.assertEquals(1, App.passGenerator(8,2,2));

    }

}
