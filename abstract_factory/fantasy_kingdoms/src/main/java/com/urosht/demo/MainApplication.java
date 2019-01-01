package com.urosht.demo;

import com.urosht.demo.army.Army;
import com.urosht.demo.castle.Castle;
import com.urosht.demo.factory.KingdomFactory;
import com.urosht.demo.factory.impl.ElfKingdomFactory;
import com.urosht.demo.factory.impl.OrcKingdomFactory;
import com.urosht.demo.king.King;

public class MainApplication {

  public enum Type {
    ORC, ELF;
  }

  public static KingdomFactory makeFactory(Type type) {

    switch (type) {
      case ELF:
        return new ElfKingdomFactory();
      case ORC:
        return new OrcKingdomFactory();
        default:
          throw new IllegalArgumentException("Kingdom type not supported " + type);
    }
  }

  public static void main(String[] args) {

    KingdomFactory factory = makeFactory(Type.ELF);

    Army army = factory.createArmy();
    System.out.println("Army: " + army.description());

    Castle castle = factory.createCastle();
    System.out.println("Castle: " + castle.description());

    King king = factory.createKing();
    System.out.println("King: " + king.description());


  }
}
