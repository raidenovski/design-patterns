package com.urosht.demo.factory;

import com.urosht.demo.product.DuckToy;
import com.urosht.demo.product.Toy;

public class DuckToyFactory extends ToyFactory {

  @Override
  public Toy buildToy() {
    Toy duck = new DuckToy();
    duck.setSound("quack");
    duck.setMaterial("rubber");
    duck.setColor("yellow");
    return duck;
  }
}
