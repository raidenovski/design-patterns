package com.urosht.demo;

import com.urosht.demo.core.Widget;
import com.urosht.demo.core.impl.TextField;
import com.urosht.demo.decorator.BorderDecorator;
import com.urosht.demo.decorator.ScrollDecorator;

public class WidgetDecoratorApplication {

    public static void main(String[] args) {
        // Client has the responsibility to compose desired configurations
        Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 30))));
        widget.draw();
    }
}
