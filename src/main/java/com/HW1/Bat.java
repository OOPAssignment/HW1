package com.HW1;

public class Bat extends Creature implements Flyer, Eater {
  private String name;

  public Bat(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void move() {
    this.fly();
  }

  public void fly() {
    System.out.println(name + " " + getClass().getSimpleName() + " is swooping through the dark.");
  }

  public void eat(Creature creature) {
    super.doEat(creature);
  }

  public void eat(Thing thing) {
    System.out.println(name + " " + getClass().getSimpleName() + " won't eat a " + thing);
  }
}
