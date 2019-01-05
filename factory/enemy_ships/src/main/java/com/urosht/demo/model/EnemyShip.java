package com.urosht.demo.model;

public abstract class EnemyShip {

  private String name;
  private double speed;
  private double damage;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public double getDamage() {
    return damage;
  }

  public void setDamage(double damage) {
    this.damage = damage;
  }

  public void displayEnemyShip() {
    System.out.println(getName() + " is on the screen");
  }


  public void followHeroShip() {
    System.out.println(getName() + " is following hero ship");
  }


  public void enemyShipShoots() {
    System.out.println(getName() + " shoots and does " + getDamage() + " damage");
  }

}
