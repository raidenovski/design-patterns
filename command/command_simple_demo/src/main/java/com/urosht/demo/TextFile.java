package com.urosht.demo;

/**
 * The receiver class
 */
public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening text file " + name;
    }

    public String save() {
        return "Saving text file " + name;
    }

}
