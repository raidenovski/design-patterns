package com.urosht.demo.ships;

import com.urosht.demo.factory.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {

  private EnemyShipFactory enemyShipFactory;

  public UFOEnemyShip(EnemyShipFactory shipFactory) {
    this.enemyShipFactory = shipFactory;
  }

  @Override
  public void makeShip() {
    System.out.println("Making enemy ship " + getName());

    weapon = enemyShipFactory.addWeapon();
    engine = enemyShipFactory.addEngine();

  }
}
