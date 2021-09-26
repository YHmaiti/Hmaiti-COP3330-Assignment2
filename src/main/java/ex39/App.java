/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex39;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String toprint = "";

        ArrayList<Map<String, RecordOrganizer>> employee = new ArrayList<>();
        Map<String, RecordOrganizer> recordAll = initRecords();
        employee.add(recordAll);

        System.out.printf("%-20s | %-20s | %-20s\n", "Name", "Position", "Separation Date");

        System.out.printf("%-21s|%-22s|%-21s\n", "-".repeat(21), "-".repeat(22), "-".repeat(21));

        for (Map.Entry<String, RecordOrganizer> en: recordAll.entrySet()) {

            System.out.printf("%-20s | %-20s | %s\n", en.getValue().firstName + " " + en.getValue().lastName, en.getValue().position, en.getValue().seperationDate);

        }


    }

    public static Map<String, RecordOrganizer> initRecords() {

        Map<String, RecordOrganizer> record = new TreeMap<>();

        RecordOrganizer record1 = new RecordOrganizer("John", "Johnson", "Manager", "2016-12-31");
        RecordOrganizer record2 = new RecordOrganizer("Tou", "Xiong", "Software Engineer", "2016-10-05");
        RecordOrganizer record3 = new RecordOrganizer("Michaela", "Michaelson", "District Manager", "2015-12-19");
        RecordOrganizer record4 = new RecordOrganizer("Jake", "Jacobson", "Programmer");
        RecordOrganizer record5 = new RecordOrganizer("Jacquelyn", "Jackson", "DBA");
        RecordOrganizer record6 = new RecordOrganizer("Sally", "Weber", "Web Developer", "2015-12-18");

        record.put(record1.lastName, record1);
        record.put(record2.lastName, record2);
        record.put(record3.lastName, record3);
        record.put(record4.lastName, record4);
        record.put(record5.lastName, record5);
        record.put(record6.lastName, record6);


        return record;

    }

}

