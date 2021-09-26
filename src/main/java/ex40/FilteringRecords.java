/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex40;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FilteringRecords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<Map<String, RecordOrg>> employee = new ArrayList<>();
        Map<String, RecordOrg> recordAll = initRecords();
        employee.add(recordAll);

        System.out.print("Enter a search string: ");
        String toSearch = scanner.nextLine();

        System.out.println("\nResults: \n");

        System.out.printf("%-20s | %-20s | %-20s\n", "Name", "Position", "Separation Date");

        System.out.printf("%-21s|%-22s|%-21s\n", "-".repeat(21), "-".repeat(22), "-".repeat(21));

        for (Map.Entry<String, RecordOrg> en: recordAll.entrySet()) {

            if (en.getKey().contains(toSearch)) {
                System.out.printf("%-20s | %-20s | %s\n", en.getValue().firstName + " " + en.getValue().lastName, en.getValue().position, en.getValue().seperationDate);
            }

        }

    }

    public static Map<String, RecordOrg> initRecords() {

        Map<String, RecordOrg> record = new TreeMap<>();

        RecordOrg record1 = new RecordOrg("John", "Johnson", "Manager", "2016-12-31");
        RecordOrg record2 = new RecordOrg("Tou", "Xiong", "Software Engineer", "2016-10-05");
        RecordOrg record3 = new RecordOrg("Michaela", "Michaelson", "District Manager", "2015-12-19");
        RecordOrg record4 = new RecordOrg("Jake", "Jacobson", "Programmer");
        RecordOrg record5 = new RecordOrg("Jacquelyn", "Jackson", "DBA");
        RecordOrg record6 = new RecordOrg("Sally", "Weber", "Web Developer", "2015-12-18");

        record.put(record1.lastName, record1);
        record.put(record2.lastName, record2);
        record.put(record3.lastName, record3);
        record.put(record4.lastName, record4);
        record.put(record5.lastName, record5);
        record.put(record6.lastName, record6);


        return record;

    }
}
