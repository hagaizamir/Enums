package edu.Hagai.java;

/**
 * Created by Android2017 on 3/10/2017.
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public  static  Person moshe (){
        return  new Person("Moshe");
    }
    public  static  Person david (){
        return  new Person("David");
    }
}
