package com.company;

import java.util.Arrays;

public class Kvartira implements Payable{
    private String address;
     private Person[] family;

    public Kvartira(String address, Person[] family) {
        this.address = address;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Kvartira:" +
                "\nAddress:" + address + '\n' +
                "Family:" + family.length +" people";
    }

    @Override
    public void pay() {
        System.out.println("Kvartira is payable");
    }
}
