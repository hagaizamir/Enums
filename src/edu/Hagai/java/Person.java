package edu.Hagai.java;

/**
 * Created by Android2017 on 3/10/2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private String lastName;
    int age;

    private Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static Person moshe() {
        return new Person("Moshe", "Doe", 22);
    }

    public static Person david() {
        return new Person("David", "Doodle", 23);
    }

    public static Person moshe2() {
        return new Person("Moshe", "Cohen", 25);
    }

    public static Person david2() {
        return new Person("David", "Doodle", 29);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p2) {
        int nameDiff = name.compareTo(p2.name);
        if (nameDiff != 0) return nameDiff;

        int lastNameDiff = lastName.compareTo(p2.lastName);
        if (lastNameDiff != 0) return lastNameDiff;


        int ageDiff = age - p2.age;
        return ageDiff;


    }
//       public  int compareTo (Person p2){
//        int diff = name.compareTo(p2.name);
//        return  diff;
//    }
//public int compareTo(Object o) {
//    if (o instanceof  Person) {
//        Person p2 = (Person) o;
//
//        int diff = name.compareTo(p2.name);
//        return  diff;
//
//    }
//    return 0;
//}

}

