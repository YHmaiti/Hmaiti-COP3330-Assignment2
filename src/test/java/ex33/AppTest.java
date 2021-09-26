/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppTest {

    @Test
    @DisplayName("check that the function returns 1 to signify that the random Magic answer was generated")
    public void magicAnswer() {

        List<String> answers = new ArrayList<String>();
        answers.add("Yes,");
        answers.add("No,");
        answers.add("Maybe,");
        answers.add("Ask again later.");

        Random rand = new Random();

        Assertions.assertEquals(1, App.magicAnswer(answers, rand.nextInt()%4));

    }

}
