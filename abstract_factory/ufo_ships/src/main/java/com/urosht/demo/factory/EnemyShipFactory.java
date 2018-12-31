package com.urosht.demo.factory;

import com.urosht.demo.parts.Engine;
import com.urosht.demo.parts.Weapon;

/**
 * With Abstract Factory Pattern, it is possible not just to build ships, but also all components
 * for the ships.
 */
public interface EnemyShipFactory {

  // Here is where we define parts of the ship

  Weapon addWeapon();
  Engine addEngine();
}
