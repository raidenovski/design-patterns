package com.urosht.demo.factory;

import com.urosht.demo.model.EnemyShip;

/**
 * Only responsibility of this class is to create Enemy Ships. If new entity classes are to be added,
 * this would be the only class that needs to be changed.
 */
public class EnemyShipFactory {


  private static final String ROCKET = "R";
  private static final String UFO = "U";
  private static final String BIG = "B";

  /**
   * This method could be made static if we are willing to give up making subclasses.
   * @param type
   * @return
   */
  public EnemyShip buildEnemyShip(String type) {
    EnemyShip enemyShip = null;

    if ()
  }

}
