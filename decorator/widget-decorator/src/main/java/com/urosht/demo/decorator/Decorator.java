package com.urosht.demo.decorator;

import com.urosht.demo.core.Widget;

/**
 * Second level base class with "is-a" and "has-a" relationshup
 */
public abstract class Decorator implements Widget {

    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    // Delegation
    public void draw() {
        widget.draw();
    }
}
