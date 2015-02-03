package com.HW1;

import com.HW1.Thing;

public abstract class Creature extends Thing {
  private Thing thing;
  private String name;

  public Creature(String name) {
    super(name);
    this.name = name;
  }

  public void doEat(Thing thing) {
    this.thing = thing;
    System.out.println(name + " has just eaten a " + thing);
  }

  public abstract void move();

  public void whatDidYouEat() {
    String creatureInfo = name + " " + getClass().getSimpleName() + " ";
    String mealInfo = (thing == null) ? "has had nothing to eat!" : "has eaten a " + thing;
    System.out.println(creatureInfo + mealInfo);
  }
}

