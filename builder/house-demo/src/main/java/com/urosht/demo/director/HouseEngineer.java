package com.urosht.demo.director;

import com.urosht.demo.builder.HouseBuilder;
import com.urosht.demo.product.House;

public class HouseEngineer {

  private HouseBuilder builder;

  public HouseEngineer(HouseBuilder builder) {
    this.builder = builder;
  }

  public void constructHouse() {
    this.builder.buildBasement();
    this.builder.buildStructure();
    this.builder.buildRoof();
  }

  public House getHouse() {
    return this.builder.getHouse();
  }
}
