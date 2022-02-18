package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Chynara", 18, "F");
        Person person2 = new Person("Almazbek", 40, "M");
        Person person3 = new Person("Sultan", 23, "M");
        Person person4 = new Person("Malika", 20, "F");
        Person person5 = new Person("Sulaiman", 42, "M");
        Person person6 = new Person("Alymbek", 18, "M");
        Person[] family1 = {person1, person2};
        Person[] family2 = {person6, person3};
        Person[] family3 = {person4, person5};

        Kvartira kvartira = new Kvartira("Bishkek", family1);
        System.out.println(kvartira);
        kvartira.pay();
        System.out.println("                           ");

        Obshejitie obshejitie = new Obshejitie("Jalabad", family3);
        System.out.println(obshejitie);
        obshejitie.rent();
        System.out.println("                            ");

        Gostinica gostinica = new Gostinica("Osh", family2);
        System.out.println(gostinica);
        gostinica.rent();


    }
}
