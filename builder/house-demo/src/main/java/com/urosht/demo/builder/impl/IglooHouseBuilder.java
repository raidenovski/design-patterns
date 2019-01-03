package com.urosht.demo.builder.impl;

import com.urosht.demo.builder.HouseBuilder;
import com.urosht.demo.product.House;

public class IglooHouseBuilder implements HouseBuilder {

  private House house;

  public IglooHouseBuilder() {
    this.house = new House();
  }

  public House getHouse() {
    return this.house;
  }

  public void buildBasement() {
    this.house.setBasement("Ice basement");
  }

  public void buildStructure() {
    this.house.setStructure("Ice");
  }

  public void buildRoof() {
    this.house.setRoof("Ice dome");
  }
}
