package edu.Hagai.java;

/**
 * Created by Android2017 on 3/10/2017.
 */
public enum Suit {
    HEARTS("♥"), CLUBS("♣") , SPADES("♠") , DIAMONDS("♦");
    String aVal;

    Suit(String aVal) {
        this.aVal = aVal;
    }
    //toString (){}
    //switch case


    @Override
    public String toString() {
//        String s = super.toString();
        return aVal;
    }

    //from String
    public static Suit fromString (String s){
        for ( Suit suit : values()){
            if (s.equals(suit.aVal))
                return suit;
        }
        return null;
    }
}
