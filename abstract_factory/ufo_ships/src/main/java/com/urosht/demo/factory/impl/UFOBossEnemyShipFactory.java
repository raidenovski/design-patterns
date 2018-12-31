package com.urosht.demo.factory.impl;

import com.urosht.demo.factory.EnemyShipFactory;
import com.urosht.demo.parts.Engine;
import com.urosht.demo.parts.Weapon;
import com.urosht.demo.parts.impl.UFOBossEngine;
import com.urosht.demo.parts.impl.UFOBossWeapon;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

  public Weapon addWeapon() {
    return new UFOBossWeapon();
  }

  public Engine addEngine() {
    return new UFOBossEngine();
  }
}
