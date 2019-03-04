package com.urosht.demo;

public class Dog extends Animal {

    public Dog(String name) {
        super();
        setName(name);
        setHeight(3);
        setSound("Bark");
        setFlys(new CantFly());
    }
}
