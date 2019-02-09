package com.urosht.demo.decorator;

import com.urosht.demo.core.Widget;

/**
 * Optional embellishment
 */
public class ScrollDecorator extends Decorator {

    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    // delegate and do the extra stuff
    public void draw() {
        super.draw();
        System.out.println("Added Scroll decorator");
    }
}
