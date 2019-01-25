package com.urosht.demo.adapter;

import com.urosht.demo.old.SquarePeg;
import com.urosht.demo.thenew.RoundHole;

/**
 * A wrapper class to match the old to the new
 */
public class SquarePegAdapter {

    // the adapter 'has a' instance of the legacy class
    private final SquarePeg squarePeg;

    public SquarePegAdapter(double w) {
        this.squarePeg = new SquarePeg(w);
    }

    // identify the desired interface
    public void makeFit(RoundHole roundHole) {
        double amount = squarePeg.getWidth() - roundHole.getRadius() * Math.sqrt(2);
        System.out.println("Reducing SquarePeg " + squarePeg.getWidth() + " by " + ((amount < 0) ? 0 : amount) + " amount");
        if (amount > 0) {
            squarePeg.setWidth(squarePeg.getWidth() - amount);
            System.out.println("   width is now " + squarePeg.getWidth());
        }
    }
}
