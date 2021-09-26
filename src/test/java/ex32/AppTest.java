/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("Check that the randomized and gotten numbers are correct as if they are correct the remaining logic of the game will be correct and well initialized")
    public void checkFunctionsAreWorkingWithRandomizer() {

        // lets check that the random number generator is working to see if the remaining process will be successful in game
        int max = 100;
        int randomNumber = App.getRandomNumGen(max);
        boolean InRange;

        if (randomNumber >= 1 && randomNumber <= max) {
            InRange = true;
        } else {
            InRange = false;
        }
        Assertions.assertTrue(InRange);
    }
}
