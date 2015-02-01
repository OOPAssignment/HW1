package com.HW1;

public class Bat extends Creature implements Flyer{
  private String name;

  public Bat(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void move() {
    this.fly();
  }

  @Override
  public void fly() {
    System.out.println(name + " " + getClass().getSimpleName() + " is swooping through the dark.");
  }

  @Override
  public void doEat(Thing thing) {
    if (thing instanceof Creature)
      super.doEat(thing);
    else if (thing.getClass().equals(Thing.class))
      System.out.println(name + " " + getClass().getSimpleName() + " won't eat a " + thing);
  }
}
