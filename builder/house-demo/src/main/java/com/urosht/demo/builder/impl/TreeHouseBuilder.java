package com.urosht.demo.builder.impl;

import com.urosht.demo.builder.HouseBuilder;
import com.urosht.demo.product.House;

public class TreeHouseBuilder implements HouseBuilder {

  private House house;

  public TreeHouseBuilder() {
    this.house = new House();
  }

  public House getHouse() {
    return this.house;
  }

  public void buildBasement() {
    this.house.setBasement("No basement");
  }

  public void buildStructure() {
    this.house.setStructure("Wooden boards");
  }

  public void buildRoof() {
    this.house.setRoof("Wooden planks");
  }
}
