package com.urosht.demo;

import com.urosht.demo.colors.impl.Green;
import com.urosht.demo.colors.impl.Red;
import com.urosht.demo.shapes.Pentagon;
import com.urosht.demo.shapes.Shape;
import com.urosht.demo.shapes.Triangle;

public class ShapesAndColorsApplication {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red());
        Shape pentagon = new Pentagon(new Green());

        triangle.applyColor();
        pentagon.applyColor();
    }
}
