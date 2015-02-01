package com.HW1;

public class Tiger extends Creature {
  private String name;

  public Tiger(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void move() {
    System.out.println(name + " " + getClass().getSimpleName() + " has just pounced.");
  }
}
