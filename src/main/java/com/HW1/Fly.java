package com.HW1;

public class Fly extends Creature implements Flyer, Eater {
  private String name;

  public Fly(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void move() {
    this.fly();
  }

  public void fly() {
    System.out.println(name + " " + getClass().getSimpleName() + " is buzzing around in flight.");
  }

  public void eat(Creature creature) {
    System.out.println(name + " " + getClass().getSimpleName() + " won't eat a " + creature);
  }

  public void eat(Thing thing) {
    super.doEat(thing);
  }
}
