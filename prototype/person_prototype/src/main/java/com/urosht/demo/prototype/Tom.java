package com.urosht.demo.prototype;

public class Tom implements Person {

    private final String NAME = "Tom";

    public Person clone() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tom{");
        sb.append("NAME='").append(NAME).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
