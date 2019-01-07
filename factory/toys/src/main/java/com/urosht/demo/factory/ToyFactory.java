package com.urosht.demo.factory;

import com.urosht.demo.product.Toy;

/**
 * This could easily be an interface or an abstract class, if we are never to instantiate a generic 'Toy' object.
 */
public class ToyFactory {

  public Toy buildToy() {
    Toy toy = new Toy();
    toy.setColor("white");
    toy.setMaterial("wood");
    toy.setSound("thump");
    return toy;
  }
}
