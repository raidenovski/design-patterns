package com.urosht.demo.prototype;

public class John implements Person{

    private final String NAME = "John";
    public Person clone() {
        return new John();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("John{");
        sb.append("NAME='").append(NAME).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
