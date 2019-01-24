package com.urosht.demo;

import com.urosht.demo.after.LineAdapter;
import com.urosht.demo.after.RectangleAdapter;
import com.urosht.demo.after.Shape;
import com.urosht.demo.before.Line;
import com.urosht.demo.before.Rectangle;

public class ShapesApplication {

    public static void main(String[] args) {

        System.out.println("Before demo =============");
        Object[] shapes = {new Line(), new Rectangle()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        int width = 40, height = 40;

        for (Object shape : shapes) {

            if (shape.getClass().getSimpleName().equals("Line")) {
                ((Line)shape).draw(x1, x2, y1, y2);
            } else {
                ((Rectangle)shape).draw(x1, x2, width, height);
            }
        }

        System.out.println("After demo =============");
        Shape[] shapesAfter = {new RectangleAdapter(new Rectangle()), new LineAdapter(new Line())};

        for (Shape shape : shapesAfter) {
            shape.draw(x1, x2, y1, y2);
        }
    }

}
