package com.urosht.demo;

import com.urosht.demo.factory.EnemyShipFactory;
import com.urosht.demo.factory.impl.UFOBossEnemyShipFactory;
import com.urosht.demo.factory.impl.UFOEnemyShipFactory;
import com.urosht.demo.ships.EnemyShip;
import com.urosht.demo.ships.UFOBossEnemyShip;

/**
 * The only class that needs to change if we want to determine which enemy ship needs to be built
 */
public class UFOEnemyShipBuilding extends EnemyShipBuilding {

  protected EnemyShip makeEnemyShip(String typeOfShip) {
    EnemyShip enemyShip = null;

    if (typeOfShip.equals("UFO")) {
      EnemyShipFactory enemyShipFactory = new UFOEnemyShipFactory();
      enemyShip = new UFOBossEnemyShip(enemyShipFactory);
      enemyShip.setName("Grunt enemy ship");
    } else if (typeOfShip.equals("UFO BOSS")) {
      EnemyShipFactory enemyShipFactory = new UFOBossEnemyShipFactory();
      enemyShip = new UFOBossEnemyShip(enemyShipFactory);
      enemyShip.setName("UFO Boss Ship");
    }
    return enemyShip;
  }
}
