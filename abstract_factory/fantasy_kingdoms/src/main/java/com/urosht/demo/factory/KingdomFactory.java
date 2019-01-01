package com.urosht.demo.factory;

import com.urosht.demo.army.Army;
import com.urosht.demo.castle.Castle;
import com.urosht.demo.king.King;

public interface KingdomFactory {

  Army createArmy();
  King createKing();
  Castle createCastle();

}
