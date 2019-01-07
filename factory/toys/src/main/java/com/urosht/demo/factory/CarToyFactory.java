package com.urosht.demo.factory;

import com.urosht.demo.product.CarToy;
import com.urosht.demo.product.DuckToy;
import com.urosht.demo.product.Toy;

public class CarToyFactory extends ToyFactory {

  @Override
  public Toy buildToy() {
    Toy car = new CarToy();
    car.setSound("vrooom");
    car.setMaterial("metal");
    car.setColor("red");
    return car;
  }
}
