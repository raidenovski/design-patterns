package com.urosht.demo.ships;

import com.urosht.demo.factory.EnemyShipFactory;

public class UFOBossEnemyShip extends EnemyShip {

  private EnemyShipFactory enemyShipFactory;

  public UFOBossEnemyShip(EnemyShipFactory enemyShipFactory) {
    this.enemyShipFactory = enemyShipFactory;
  }

  @Override
  public void makeShip() {
    System.out.println("Making enemy ship " + getName());

    weapon = enemyShipFactory.addWeapon();
    engine = enemyShipFactory.addEngine();
  }
}
