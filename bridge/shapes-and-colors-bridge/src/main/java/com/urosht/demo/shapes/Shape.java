package com.urosht.demo.shapes;

import com.urosht.demo.colors.Color;

public abstract class Shape {

    // Implementor
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
