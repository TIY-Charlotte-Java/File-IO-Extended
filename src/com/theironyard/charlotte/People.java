package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
            //map.putIfAbsent(person.country, ppl);
        }
        map.get(ppl).toArray();
//        System.out.println(ppl.get(0).toString());
//        System.out.println(ppl.get(1).toString());

//        for (HashMap.Entry<String, ArrayList<Person>> entry : map.entrySet()) {
//            String key = entry.getKey();
//            ArrayList<Person> values = entry.getValue();
//            System.out.println("Key = " + key);
//            System.out.println("Value = " + values);
        }
        //System.out.println(ppl);


}