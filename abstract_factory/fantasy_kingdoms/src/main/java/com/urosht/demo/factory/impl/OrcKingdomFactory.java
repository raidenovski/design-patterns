package com.urosht.demo.factory.impl;

import com.urosht.demo.army.Army;
import com.urosht.demo.army.impl.OrcArmy;
import com.urosht.demo.castle.Castle;
import com.urosht.demo.castle.impl.OrcCastle;
import com.urosht.demo.factory.KingdomFactory;
import com.urosht.demo.king.King;
import com.urosht.demo.king.impl.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {

  public Army createArmy() {
    return new OrcArmy();
  }

  public King createKing() {
    return new OrcKing();
  }

  public Castle createCastle() {
    return new OrcCastle();
  }
}
