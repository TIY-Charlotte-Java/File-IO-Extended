package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class People {

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, ArrayList<Person>> map = new HashMap<>();
        ArrayList<Person> ppl = new ArrayList<>();

        File f = new File("list.txt");
        Scanner fileScanner = new Scanner(f);
        fileScanner.nextLine();
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split(",");
            Person person = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            ppl.add(person);
            addPerson(map, person);
        }
        Set<Map.Entry<String, ArrayList<Person>>> one = map.entrySet();
        System.out.println(one.toString());

    }

        public static void addPerson(HashMap<String, ArrayList<Person>> perpList, Person p) {
            ArrayList<Person> perp = new ArrayList<>();

            perp = perpList.putIfAbsent(p.country, perp);
            if (perp != null) {
                perp.add(p);
            } else {
                perpList.get(p.country).add(p);
            }
    }
}