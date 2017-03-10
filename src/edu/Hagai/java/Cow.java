package edu.Hagai.java;

import edu.Hagai.java.race.Driver;

public class Cow extends Animal implements Driver, Runnable {
    String sound;

    public Cow(Food food, String name, String sound) {
        super(food, name);
        this.sound = sound;

    }

    public void makeSound() {
        System.out.println(getName() + " sounds " + sound);
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,sound='" + sound + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("Driving....");
    }

    @Override
    public void stop() {
        System.out.println("Stpped......");

    }

    @Override
    public void run() {

    }
}
   