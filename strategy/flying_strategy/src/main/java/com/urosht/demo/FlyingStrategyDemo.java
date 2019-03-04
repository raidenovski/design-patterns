package com.urosht.demo;

public class FlyingStrategyDemo {

    public static void main(String[] args) {

        Animal spike = new Dog("spike");
        Animal birdie = new Bird("birdie");

        System.out.println("Dog: " + spike.tryToFly());
        System.out.println("Bird: " + birdie.tryToFly());
    }

}
