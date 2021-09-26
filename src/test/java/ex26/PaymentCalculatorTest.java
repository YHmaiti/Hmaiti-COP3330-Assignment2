/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    @DisplayName("Check if the monthly payment is correct!")
    public void CheckIfMonthlyPaymentIsValid() {

        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(5000.00, 100.00, 12/100.0));

    }

    @Test
    @DisplayName("Check if the monthly payment is correct!")
    public void CheckIfMonthlyPaymentIsValid2() {

        assertEquals(92, PaymentCalculator.calculateMonthsUntilPaidOff(6000.00, 100.00, 12/100.0));

    }

}