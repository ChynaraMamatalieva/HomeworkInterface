package com.company;

import java.util.Arrays;

public class Gostinica implements Rentable{
    private String address;
    private Person[] family;

    public Gostinica(String address, Person[] family) {
        this.address = address;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Gostinica:" +
                "\nAddress:" + address + '\n' +
                "Family:" + family.length +" people";
    }

    @Override
    public void rent() {
        System.out.println("Gostinics is rentable");

    }
}
