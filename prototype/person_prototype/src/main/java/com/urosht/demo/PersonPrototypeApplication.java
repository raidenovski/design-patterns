package com.urosht.demo;

import com.urosht.demo.prototype.Factory;
import com.urosht.demo.prototype.Person;

public class PersonPrototypeApplication {

    public static void main(String[] args) {

        String[] names = new String[] {"tom", "john", "harry"};

        for (String name : names) {
            Person prototype = Factory.getPrototype(name);
            System.out.println("Found prototype " + prototype.toString());
        }
    }

}
