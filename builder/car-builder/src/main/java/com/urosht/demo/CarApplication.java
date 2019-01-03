package com.urosht.demo;

import com.urosht.demo.builder.impl.CarBuilderImpl;
import com.urosht.demo.director.CarDirector;

public class CarApplication {

  public static void main(String[] args) {
    CarDirector carDirector = new CarDirector(new CarBuilderImpl()); // pass a concrete builder implementation here

    System.out.println(carDirector.construct().toString());
  }
}
