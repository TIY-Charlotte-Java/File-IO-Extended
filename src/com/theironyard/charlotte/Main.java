package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, ArrayList<Person>> allPeople = new HashMap<>();
        // read all the people into memory
        File f = new File("people.txt");
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split(",");
            Person p = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            AddPersonToHashMap(allPeople, p);
        }
//        type variable : list
        for (String s : allPeople.keySet()){
            System.out.println(allPeople.get(s).toString());
        }
    }

    static void AddPersonToHashMap(HashMap<String, ArrayList<Person>> src, Person p) {
        ArrayList<Person> person = new ArrayList<>();
        person = src.putIfAbsent(p.country, person);
        if (person == null){
            src.get(p.country).add(p);
        }
        else {
            person.add(p);
        }
    }
}
