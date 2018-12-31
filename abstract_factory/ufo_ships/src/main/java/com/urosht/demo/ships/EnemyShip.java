package com.urosht.demo.ships;

import com.urosht.demo.parts.Engine;
import com.urosht.demo.parts.Weapon;

public abstract class EnemyShip {

  private String name;
  Engine engine;
  Weapon weapon;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void makeShip();

  public void followHeroShip() {
    System.out.println(getName() + " is following the hero at " + engine);
  }

  public void displayEnemyShip() {
    System.out.println(getName() + " is on the screen");
  }

  public void enemyShipShoots() {
    System.out.println(getName() + " attacks and does " + weapon + " damage");
  }

  public String toString() {
    return "The " + name + " has a top speed of " + engine +
    " and an attack power of " + weapon;
  }

}
