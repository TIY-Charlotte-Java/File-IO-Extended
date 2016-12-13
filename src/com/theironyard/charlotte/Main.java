package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here


        HashMap<String, ArrayList<Person>> list = new HashMap<>();

        Person person = new Person();
        //list.put("emilee", 2,"emileen","mar","daf","canada",);


        File f = new File("Directory.txt");
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split(",");
            Person person1 = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            //addPersonToHashMap1(list, person1);
            addPersonToHashMap(list, person1);


            // Set keyset = newList.keySet();
            // System.out.println(keyset);


            //for ( String output : person1){


        }


    }


    public static void addPersonToHashMap(HashMap<String, ArrayList<Person>> countryList, Person p) {
        ArrayList<Person> people = new ArrayList<>();

        countryList.putIfAbsent(p.country, people);

        ArrayList<Person> countryPeople;
        countryPeople = countryList.get(p.getCountry());
        countryPeople.add(p);
        System.out.println(p.toString());


    }

}









