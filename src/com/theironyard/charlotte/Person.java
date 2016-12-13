package com.theironyard.charlotte;

public class Person extends People {
    int id;
    String firstName;
    String lastName;
    String email;
    String country;
    String ip;

    public Person(int id, String firstName, String lastName, String email, String country, String ip) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.ip = ip;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " " + email + " " + country + " " + ip;
    }


}

//id,first_name,last_name,email,country,ip_address