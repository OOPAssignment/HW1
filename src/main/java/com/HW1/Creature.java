package com.HW1;

public abstract class Creature extends Thing {
  private Thing thing;
  private String name;

  public Creature(String name) {
    super(name);
    this.name = name;
  }

  public void eat(Thing thing) {
    this.thing = thing;
    System.out.println(getClass().getSimpleName() + " has eaten a " + thing);
  }

  public abstract void move();

  public void whatDidYouEat() {
    String creatureInfo = name + getClass().getSimpleName() + " ";
    String mealInfo = (thing == null) ? "has had nothing to eat!" : "has eaten a " + thing;
    System.out.println(creatureInfo + mealInfo);
  }
}

