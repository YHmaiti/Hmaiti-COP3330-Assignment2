/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    @DisplayName("Check that the name chosen from the list of employees is removed successfully")
    public void employeeManagerCheck() {

        List<String> employees = new ArrayList<String>();
        List<String> newListUpdated = new ArrayList<>();

        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        String name  = "Jeremy Goodwin";

        newListUpdated.add("John Smith");
        newListUpdated.add("Jackie Jackson");
        newListUpdated.add("Chris Jones");
        newListUpdated.add("Amanda Cullen");


        Assertions.assertEquals(newListUpdated, App.employeeManager(employees, name));

    }

}
