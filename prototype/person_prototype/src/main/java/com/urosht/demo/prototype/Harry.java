package com.urosht.demo.prototype;

public class Harry implements Person {

    private final String NAME = "Harry";

    public Person clone() {
        return new Harry();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Harry{");
        sb.append("NAME='").append(NAME).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
