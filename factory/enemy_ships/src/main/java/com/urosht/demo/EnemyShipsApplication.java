package com.urosht.demo;

import com.urosht.demo.factory.EnemyShipFactory;
import com.urosht.demo.model.EnemyShip;

import java.util.Scanner;

public class EnemyShipsApplication {

  public static void main(String[] args) {

    EnemyShipFactory factory = new EnemyShipFactory();

    EnemyShip enemyShip = null;

    Scanner scanner = new Scanner(System.in);

    System.out.print("What type of ship? (U/R/B)");

    if (scanner.hasNextLine()) {
      enemyShip =  factory.buildEnemyShip(scanner.nextLine());

      if (enemyShip != null) {

        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();

      } else {
        System.out.println("Please enter U, R or B next time");
      }
    }


  }

}
