package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, ArrayList<Person>> people = new HashMap<>();
        File f = new File("Catalogue.txt");
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\,");
            Person person = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3],
                    columns[4], columns[5]);
            addPersonToHashMap(people, person);
        }
    }
    public static void addPersonToHashMap (HashMap<String, ArrayList<Person>> src, Person p) {
            // See if the country is in the map
        if (src.containsKey(p.getCountry())) {
            // If the country is already in the map allow adding another person
            ArrayList<Person> people1 = src.get(p.getCountry());
            people1.add(p);
        } else {
            // If the country isn't in the map add the country.
            ArrayList<Person> people = new ArrayList<>();
            people.add(p);
            src.putIfAbsent(p.getCountry(), people);
            System.out.println(p.toString());
        }
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

