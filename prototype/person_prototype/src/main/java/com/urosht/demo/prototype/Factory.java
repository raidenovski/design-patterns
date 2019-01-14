package com.urosht.demo.prototype;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private static final Map<String, Person> prototypes = new HashMap<String, Person>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("john", new John());
        prototypes.put("harry", new Harry());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type);
        } catch (NullPointerException npe) {
            System.out.println("Prototype not found with name " + type);
            return null;
        }
    }

}
