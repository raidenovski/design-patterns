package com.urosht.demo;

import com.urosht.demo.ships.EnemyShip;

public abstract class EnemyShipBuilding {

  // Acts as an 'ordering mechanism' for creating UFO ships that have a name, weapon and engine
  // The specific parts used for the Weapon and Engine are defined when passing the typeOfShip
  protected abstract EnemyShip makeEnemyShip(String typeOfShip);

  public EnemyShip orderShip(String typeOfShip) {
    EnemyShip enemyShip = makeEnemyShip(typeOfShip);

    enemyShip.makeShip();
    enemyShip.displayEnemyShip();
    enemyShip.followHeroShip();
    enemyShip.enemyShipShoots();
    return enemyShip;
  }

}
