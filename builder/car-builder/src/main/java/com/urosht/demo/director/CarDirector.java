package com.urosht.demo.director;

import com.urosht.demo.builder.CarBuilder;
import com.urosht.demo.product.Car;

public class CarDirector {

  private CarBuilder carBuilder;

  public CarDirector(CarBuilder carBuilder) {
    this.carBuilder = carBuilder;
  }

  public Car construct() {
    return carBuilder.setColor("Red")
        .setWheels(4)
        .setType("Honda")
        .build();
  }
}
