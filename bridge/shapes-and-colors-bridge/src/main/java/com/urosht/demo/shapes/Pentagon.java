package com.urosht.demo.shapes;

import com.urosht.demo.colors.Color;

public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    public void applyColor() {
        System.out.print("Pentagon gets filled with ");
        color.applyColor();
    }
}
