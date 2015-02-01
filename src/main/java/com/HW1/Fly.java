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

  @Override
  public void doEat(Thing thing) {
    if (thing instanceof Creature)
      System.out.println(name + " " + getClass().getSimpleName() + " won't eat a " + thing);
    else
      super.doEat(thing);
  }

  @Override
  public void fly() {
    System.out.println(name + " " + getClass().getSimpleName() + " is buzzing around in flight.");
  }

  @Override
  public void eat(Creature creature) {
    System.out.println(name + " " + getClass().getSimpleName() + " won't eat a " + creature);
  }

  @Override
  public void eat(Thing thing) {
    super.doEat(thing);
  }
}
