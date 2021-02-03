package PolymorphPack;

public class Dog extends Animal {
            public void bark() {
            System.out.println("I am barking");
        }
        @Override
        public void eat(){ //переопределение метода
            System.out.println("Dog is eating");
        }
    }




