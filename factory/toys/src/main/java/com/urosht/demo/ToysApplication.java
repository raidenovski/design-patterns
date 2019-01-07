package com.urosht.demo;

import com.urosht.demo.factory.CarToyFactory;
import com.urosht.demo.factory.DuckToyFactory;
import com.urosht.demo.factory.ToyFactory;
import com.urosht.demo.product.Toy;

public class ToysApplication {

  public static void main(String[] args) {

    ToyFactory carFactory = new CarToyFactory();
    ToyFactory duckFactory = new DuckToyFactory();

    Toy car = carFactory.buildToy();
    Toy duck = duckFactory.buildToy();

    System.out.println("Car goes " + car.getSound());
    System.out.println("Duck goes " + duck.getSound());

  }

}
