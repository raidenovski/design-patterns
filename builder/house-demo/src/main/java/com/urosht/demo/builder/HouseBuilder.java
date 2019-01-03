package com.urosht.demo.builder;

import com.urosht.demo.product.House;

public interface HouseBuilder {

  House getHouse();

  void buildBasement();

  void buildStructure();

  void buildRoof();

}
