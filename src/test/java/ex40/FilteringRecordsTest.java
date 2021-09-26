/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex40;

import ex39.App;
import ex39.RecordOrganizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FilteringRecordsTest {

    @Test
    @DisplayName("check is valid when the map 'rec' was successfully filled and well passed back to main!")
    void initRecords() {


        Map<String, RecordOrg> rec = FilteringRecords.initRecords();

        // if the check is valid then the map 'rec' was successfully filled and well passed back to main to initiate the search for a specific employee
        Assertions.assertEquals("John",rec.get("Johnson").firstName);
        Assertions.assertEquals("Michaela", rec.get("Michaelson").firstName);
        Assertions.assertEquals("Sally", rec.get("Weber").firstName);
        Assertions.assertEquals("Manager", rec.get("Johnson").position);
        Assertions.assertEquals("DBA", rec.get("Jackson").position);
        Assertions.assertEquals("2015-12-18", rec.get("Weber").seperationDate);
        Assertions.assertEquals("2016-12-31", rec.get("Johnson").seperationDate);

    }

}