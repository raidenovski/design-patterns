package com.urosht.demo;

import com.urosht.demo.adapter.SquarePegAdapter;
import com.urosht.demo.thenew.RoundHole;

public class ToolsApplication {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter squarePegAdapter;

        for (int i = 6; i < 10; i++) {
            squarePegAdapter = new SquarePegAdapter((double)i);
            // the client uses the new interface
            squarePegAdapter.makeFit(roundHole);
        }
    }

}
