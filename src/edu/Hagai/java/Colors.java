package edu.Hagai.java;

/**
 * Created by Android2017 on 3/10/2017.
 */
//PUBLIC STATIC FINAL
public enum Colors {
    RED (1), GREEN (2), BLUE(3);//values Colors.values () -> Colors[]

    private int aVal; // -> for the constructor
    //alt insert to create constructor

    //the constructor can be private only
    //no access modifier
    private Colors(int aVal) {
        this.aVal = aVal;
    }
    //fromString
    public static Colors fromString (String name){
        for (Colors val : values()){
            if (val.equals(name))
                return val;
        }
        return null;
    }

    public static Colors fromInt (int n){
        //return new Colors(n);
        for (Colors c : values()){
            if (c.aVal ==n)
                return c;
        }
        return null; //throe exception
    }
}
