package com.urosht.demo;

public class Bird extends Animal {

    public Bird(String name) {
        super();
        setName(name);
        setHeight(3);
        setSound("Tweet");
        setFlys(new ItFlys());
    }
}
