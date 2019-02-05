package com.urosht.demo.shapes;

import com.urosht.demo.colors.Color;

public class Triangle extends Shape {


    public Triangle(Color color) {
        super(color);
    }

    public void applyColor() {
        System.out.print("Triangle gets filled with");
        color.applyColor();
    }
}
