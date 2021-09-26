/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex24;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

    @Test
    @DisplayName("check two words are anagrams")
    public void isAnagramTrue() {

        Assertions.assertEquals(true, App.isAnagram("tone", "note"));
        Assertions.assertEquals(true, App.isAnagram("bone", "nobe"));

    }

    @Test
    @DisplayName("check two words are not anagrams")
    public void isAnagramFalse() {

        Assertions.assertEquals(false, App.isAnagram("bone", "note"));
        Assertions.assertEquals(false, App.isAnagram("player", "voyage"));

    }

}
