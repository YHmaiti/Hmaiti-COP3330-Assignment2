/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    @DisplayName("Check if the input was passed correctly and that an int is returned")
    public void testValidateInput() {

        Assertions.assertEquals(1,App.validateInput("john", "sam", "32818", "YY-1265"));

    }

    @Test
    @DisplayName("Check if the ID validation is correct")
    void testValidateEmployeeID() {

        Assertions.assertEquals(true, App.validateEmployeeID("YY-5645"));
        Assertions.assertEquals(true, App.validateEmployeeID("LM-4587"));
        Assertions.assertEquals(false, App.validateEmployeeID("MKL45878"));

    }

    @Test
    @DisplayName("Check if the first name validation is correct")
    void testValidateFirstName() {

        Assertions.assertEquals(true, App.validateFirstName("John"));
        Assertions.assertEquals(true, App.validateFirstName("Yohan"));
        Assertions.assertEquals(false, App.validateFirstName("J"));
        Assertions.assertEquals(false, App.validateFirstName(""));

    }

    @Test
    @DisplayName("Check if the last name validation is correct")
    void testValidateLastName() {

        Assertions.assertEquals(true, App.validateLastName("Monroe"));
        Assertions.assertEquals(true, App.validateLastName("Sam"));
        Assertions.assertEquals(false, App.validateLastName("O"));
        Assertions.assertEquals(false, App.validateLastName(""));

    }

    @Test
    @DisplayName("Check if the ZipCode validation is correct")
    void testValidateZipCode() {

        Assertions.assertEquals(true, App.validateZipCode("42123"));
        Assertions.assertEquals(true, App.validateZipCode("32818"));
        Assertions.assertEquals(false, App.validateZipCode("45698745"));
        Assertions.assertEquals(false, App.validateZipCode("ABCBC"));

    }
}
