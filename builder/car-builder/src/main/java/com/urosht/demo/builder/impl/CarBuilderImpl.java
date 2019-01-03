package com.urosht.demo.builder.impl;

import com.urosht.demo.builder.CarBuilder;
import com.urosht.demo.product.Car;

public class CarBuilderImpl implements CarBuilder {

  private Car tempCar;

  public CarBuilderImpl() {
    this.tempCar = new Car();
  }

  public Car build() {
    Car car = new Car();
    car.setColor(tempCar.getColor());
    car.setWheels(tempCar.getWheels());
    return car;
  }

  public CarBuilder setColor(String color) {
    this.tempCar.setColor(color);
    return this;
  }

  public CarBuilder setWheels(int wheels) {
    this.tempCar.setWheels(wheels);
    return this;
  }

  public CarBuilder setType(String type) {
    this.tempCar.setType(type);
    return this;
  }

}
