package com.urosht.demo.core.impl;

import com.urosht.demo.core.Widget;

/**
 * Core class with "is-a" relationship
 */
public class TextField implements Widget {

    private int width, height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Text field " + width + ";" + height);
    }
}
