package com.theironyard.charlotte;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<Person>> people = new HashMap<>();

        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split("//,");
            Person person1 = new Person(String.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            addToHashMap(people, person1);
            System.out.print(person1);
        }

    }

    public static void addToHashMap(HashMap<String, ArrayList<Person>> src, Person p) {
        ArrayList<Person> persons = new ArrayList<>();
        src.putIfAbsent(p.country, persons);
        src.get(p.country).add(p);
    }

}

