package com.theironyard.charlotte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by emileenmarianayagam on 12/12/16.
 */
public class Person {
    //we want to read the file
    //what ever we read we need to store it into an arraylist


    int id;
    String first_Name;
    String last_Name;
    String email;
    String country;
    String ip_Address;

    public Person(int id, String first_Name, String last_Name, String email, String country, String ip_Address) {
        this.id = id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.email = email;
        this.country = country;
        this.ip_Address = ip_Address;
    }

    Person(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp_Address() {
        return ip_Address;
    }

    public void setIp_Address(String ip_Address) {
        this.ip_Address = ip_Address;
    }

    @Override
    public String toString(){
        return String.format("%s %s from  %s", getFirst_Name(),  getLast_Name(), getCountry());
    }



    }





