package edu.Hagai.java;

/**
 * Created by Android2017 on 3/10/2017.
 */
public class Person implements Comparable {
    private String name;

    private Person(String name) {
        this.name = name;
    }
    public  static  Person moshe (){

        return  new Person("Moshe");
    }
    public  static  Person david (){
        return  new Person("David");
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof  Person) {
            Person p2 = (Person) o;

            int diff = name.compareTo(p2.name);
            return  diff;

        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
