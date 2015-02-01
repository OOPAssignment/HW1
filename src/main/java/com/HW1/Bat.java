package com.HW1;

public class Bat extends Creature implements Flyer, Eater{
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
  public void eat(Creature creature) {
    super.doEat(creature);
  }

  @Override
  public void eat(Thing thing) {
    System.out.println(name + " " + getClass().getSimpleName() + " won't eat a " + thing);
  }
}
