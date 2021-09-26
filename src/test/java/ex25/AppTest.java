/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex25;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest {

    @Test
    @DisplayName("Check for Very Weak passwords.")
    public void checkPassVeryWeak() {

        assertEquals(1, App.passwordValidator("12345"));
        assertEquals(1, App.passwordValidator("897545"));

    }

    @Test
    @DisplayName("Check for Weak Passwords.")
    public void checkPassWeak() {

        assertEquals(2, App.passwordValidator("abcghfh"));
        assertEquals(2, App.passwordValidator("abcdfg"));


    }

    @Test
    @DisplayName("Check for Strong passwords.")
    public void checkPassStrong() {

        assertEquals(3, App.passwordValidator("abc586utl"));
        assertEquals(3, App.passwordValidator("azertazerzerarazer55656"));

    }

    @Test
    @DisplayName("Check for Very Strong passwords.")
    public void checkPassVeryStrong() {

        assertEquals(4, App.passwordValidator("5442@@%%2"));
        assertEquals(4, App.passwordValidator("1337h@xor"));

    }

}
