package edu.Hagai.java;

public abstract class Animal
    {
        public enum Food{GRAINS, MEAT, GRASS}

        private Food food;
        private String name;

        public Animal(Food food, String name)
        {
            this.food = food;
            this.name = name;
        }

        public void eat()
        {
            System.out.println(name + " eats " + food);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" +
                    "food=" + food +
                    ", name='" + name + '\'';
        }

        protected abstract void makeSound();

        public Food getFood() {
            return food;
        }

        public String getName() {
            return name;
        }
    }

