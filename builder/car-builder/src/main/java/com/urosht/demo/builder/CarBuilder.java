package com.urosht.demo.builder;

import com.urosht.demo.product.Car;

public interface CarBuilder {

  Car build();

  CarBuilder setColor(String color);

  CarBuilder setWheels(int wheels);

  CarBuilder setType(String type);
}
