package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    int iD;
    String firstName;
    String lastName;
    String eMail;
    String country;
    String ipAdress;

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public Person(int iD, String firstName, String lastName, String eMail, String country, String ipAdress) {
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.country = country;
        this.ipAdress = ipAdress;
    }
    @Override
    public String toString() {
        return String.format("%s %s from %s.", getFirstName(), getLastName(), getCountry());
    }
}
//        Create a project called Person with this file in the project root.
//        Read the csv file into a HashMap<String, ArrayList<Person>> that maps country name to a
//        list of people who are from that country.
//
//        Requirements
//
//        Create a Person class to store all the columns in the csv file.
//
//        Create a HashMap<String, ArrayList<Person>> that maps country name to a list of people from that country.
//
//        Override toString in the Person class to print out a nicely-formatted string for that person
//        (something like "Martha Jenkins from France").
//
//        Print out the entire HashMap at the end. (loop over every person and print it out)