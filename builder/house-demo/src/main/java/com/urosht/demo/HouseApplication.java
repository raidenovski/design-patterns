package com.urosht.demo;

import com.urosht.demo.builder.impl.IglooHouseBuilder;
import com.urosht.demo.builder.impl.TreeHouseBuilder;
import com.urosht.demo.director.HouseEngineer;
import com.urosht.demo.product.House;

public class HouseApplication {

  public static void main(String[] args) {

    HouseEngineer eskimoEngineer = new HouseEngineer(new IglooHouseBuilder());
    HouseEngineer hippieEngineer = new HouseEngineer(new TreeHouseBuilder());

    eskimoEngineer.constructHouse();
    hippieEngineer.constructHouse();

    House igloo = eskimoEngineer.getHouse();
    House treehouse = hippieEngineer.getHouse();

    System.out.println("Eskimo has built a " + igloo.toString());
    System.out.println("Hippie has built a " + treehouse.toString());
  }
}
