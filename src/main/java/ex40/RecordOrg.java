/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

package ex40;

public class RecordOrg {

    public String firstName;
    public String lastName;
    public String position;
    public String seperationDate;

    public RecordOrg(String first, String last, String pos, String date) {

        this.firstName = first;
        this.lastName = last;
        this.position = pos;
        this.seperationDate = date;

    }

    public RecordOrg(String first, String last, String pos) {

        this.firstName = first;
        this.lastName = last;
        this.position = pos;
        this.seperationDate ="";

    }

}
