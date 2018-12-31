package com.urosht.demo;

import com.urosht.demo.ships.EnemyShip;

public class EnemyShipApplication {

  public static void main(String[] args) {

    // EnemyShipBuilding handles orders for new EnemyShips
    // You send it a code using the orderTheShip method &
    // it sends the order to the right factory for creation

    EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
    EnemyShip theGrunt = MakeUFOs.orderShip("UFO");

    System.out.println(theGrunt + "\n");
    EnemyShip theBoss = MakeUFOs.orderShip("UFO BOSS");

    System.out.println(theBoss + "\n");

  }
}
