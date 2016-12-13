package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 12/12/16.
 */
public class Person {
    int id;
    String firstName;
    String lastName;
    String email;
    String country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    String ipAddress;

    public Person(Integer id, String firstName, String lastName, String email, String country, String ipAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.ipAddress = ipAddress;
    }
    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + " from the good ol' " + getCountry() + "\n";
    }
}
