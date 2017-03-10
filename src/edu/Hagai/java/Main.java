package edu.Hagai.java;

import edu.Hagai.java.race.Driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here


        ArrayList<Person> people = new ArrayList<>();
        people.add(Person.moshe());
        people.add(Person.david());
        people.add(Person.moshe());
        people.add(Person.david());

        Collections.sort(people);
        System.out.println(people);


//        String aba = "Aba";
//        String o = "Mama";
//
//        int diff = o.compareTo(aba);
//        System.out.println(diff);
//


        Colors c = Colors.BLUE;

        //RED, GREEN , BLUE are the values
        //init with value
        Colors c2 = Colors.valueOf("GREEN");

        //init with a class...
        Enum.valueOf(Colors.class, "RED");

        //iterate all the values
//        Colors.values();
        Colors[] values = Colors.values();
        for (Colors val : values) {
            System.out.println(val);
        }
        Suit[] suits = Suit.values();
        for (Suit s : suits) {
            System.out.println(s);

        }


//        List<Colors> cList = Arrays.asList(values);


    }
}
