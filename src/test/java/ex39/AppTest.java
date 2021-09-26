/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

public class AppTest {


    @Test
    @DisplayName("Test that the map built is correct")
    public void initRecordsTest() {

        Map<String, RecordOrganizer> rec = App.initRecords();

        // if the check is valid then the map 'rec' was successfully filled and well passed back to main!
        Assertions.assertEquals("John",rec.get("Johnson").firstName);
        Assertions.assertEquals("Michaela", rec.get("Michaelson").firstName);
        Assertions.assertEquals("Sally", rec.get("Weber").firstName);
        Assertions.assertEquals("Manager", rec.get("Johnson").position);
        Assertions.assertEquals("DBA", rec.get("Jackson").position);
        Assertions.assertEquals("2015-12-18", rec.get("Weber").seperationDate);
        Assertions.assertEquals("2016-12-31", rec.get("Johnson").seperationDate);

    }
}
