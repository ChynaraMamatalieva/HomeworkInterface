package com.company;

import java.util.Arrays;

public class Obshejitie implements Rentable{
    private String address;
    private Person[] family;

    @Override
    public String toString() {
        return "Obshejitie:" +'\n'+
                "Address:" + address + '\n' +
                "Family:" + family.length + " people";
    }

    public Obshejitie(String address, Person[] family) {
        this.address = address;
        this.family = family;
    }

    @Override
    public void rent() {
        System.out.println("Obshejitie is rentable");

    }
}
