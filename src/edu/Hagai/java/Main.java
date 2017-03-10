package edu.Hagai.java;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Colors c = Colors.BLUE;

        //RED, GREEN , BLUE are the values
        //init with value
        Colors c2 = Colors.valueOf("GREEN");

        //init with a class...
        Enum.valueOf(Colors.class , "RED");

        //iterate all the values
//        Colors.values();
        Colors[] values = Colors.values();
        for (Colors val : values){
            System.out.println(val);
        }
       Suit [] suits = Suit.values();
        for (Suit s : suits){
            System.out.println(s);

        }


//        List<Colors> cList = Arrays.asList(values);


    }
}
