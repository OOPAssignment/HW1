package com.HW1;

import com.HW1.Creature;
import com.HW1.Thing;

public interface Eater {
  void eat(Creature creature);
  void eat(Thing thing);

}
