package com.urosht.demo.factory.impl;

import com.urosht.demo.parts.Engine;
import com.urosht.demo.parts.Weapon;
import com.urosht.demo.factory.EnemyShipFactory;
import com.urosht.demo.parts.impl.UFOEngine;
import com.urosht.demo.parts.impl.UFOWeapon;

/**
 * This factory uses creates specific UFO enemy ship parts
 */
public class UFOEnemyShipFactory implements EnemyShipFactory {

  public Weapon addWeapon() {
    return new UFOWeapon();
  }

  public Engine addEngine() {
    return new UFOEngine();
  }
}
