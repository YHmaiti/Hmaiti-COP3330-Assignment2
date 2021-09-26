/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    @DisplayName("Check that the random index generator is valid")
    public void winnerAnnouncerIndexGeneratorCheck() {

        List<String> names = new ArrayList<String>();

        names.add("john");
        names.add("sara");
        names.add("Victor");
        names.add("Joshua");

        String winner  = names.get(App.winnerAnnouncer(names));

        Assertions.assertEquals(true, names.contains(winner));

    }

}
