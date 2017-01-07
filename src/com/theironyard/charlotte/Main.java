package com.theironyard.charlotte;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        HashMap<String, ArrayList<Person>> people = new HashMap<>();
        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] element = line.split(",");
            Person person = new Person(Integer.valueOf(element[0]), (element[1]), (element[2]), (element[3]), (element[4]), (element[5]));
            addToHashMap(people, person);
            System.out.println(person);
        }
    }
    public static void addToHashMap(HashMap<String, ArrayList<Person>> map, Person p) {
        if(map.containsKey(p.getCountry())) {
            ArrayList<Person> peoples = map.get(p.getCountry());
            peoples.add(p);
        } else {
            ArrayList<Person> people = new ArrayList<>();
            people.add(p);
            map.putIfAbsent(p.getCountry(), people);
            System.out.println(p.toString());
        }
    }
}
