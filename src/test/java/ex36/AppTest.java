/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    public void average() {
        List<String> numbers = new ArrayList<String>();
        numbers.add("5");
        numbers.add("54");
        numbers.add("56");
        numbers.add("45");
        numbers.add("10");
        numbers.add("4");

        List<Double> numbersFinal = new ArrayList<Double>(numbers.size()) ;

        for (String current : numbers) {

            numbersFinal.add(Double.valueOf(current));

        }

        Assertions.assertEquals(29, App.average(numbersFinal));

    }

    @Test
    public void max() {

        List<String> numbers = new ArrayList<String>();
        numbers.add("65");
        numbers.add("55");
        numbers.add("85");
        numbers.add("65");
        numbers.add("95");
        numbers.add("35");

        List<Double> numbersFinal = new ArrayList<Double>(numbers.size()) ;

        for (String current : numbers) {

            numbersFinal.add(Double.valueOf(current));

        }

        Assertions.assertEquals(95, App.max(numbersFinal));

    }

    @Test
    public void min() {

        List<String> numbers = new ArrayList<String>();
        numbers.add("7");
        numbers.add("5");
        numbers.add("4");
        numbers.add("3");
        numbers.add("2");
        numbers.add("1");

        List<Double> numbersFinal = new ArrayList<Double>(numbers.size()) ;

        for (String current : numbers) {

            numbersFinal.add(Double.valueOf(current));

        }

        Assertions.assertEquals(1, App.min(numbersFinal));

    }

    @Test
    public void std() {

        List<String> numbers = new ArrayList<String>();
        numbers.add("100");
        numbers.add("200");
        numbers.add("1000");
        numbers.add("300");

        List<Double> numbersFinal = new ArrayList<Double>(numbers.size()) ;

        for (String current : numbers) {

            numbersFinal.add(Double.valueOf(current));

        }

        Assertions.assertEquals(353.5533905932738, App.std(numbersFinal));

    }
}
