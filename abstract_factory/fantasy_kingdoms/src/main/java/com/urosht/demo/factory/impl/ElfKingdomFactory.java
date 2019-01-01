package com.urosht.demo.factory.impl;

import com.urosht.demo.army.Army;
import com.urosht.demo.army.impl.ElfArmy;
import com.urosht.demo.castle.Castle;
import com.urosht.demo.castle.impl.ElfCastle;
import com.urosht.demo.factory.KingdomFactory;
import com.urosht.demo.king.King;
import com.urosht.demo.king.impl.ElfKing;

public class ElfKingdomFactory implements KingdomFactory {

  public Army createArmy() {
    return new ElfArmy();
  }

  public King createKing() {
    return new ElfKing();
  }

  public Castle createCastle() {
    return new ElfCastle();
  }
}
