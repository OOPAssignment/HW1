package com.HW1;

public class Ant extends Creature {
  private String name;

  public Ant(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void move() {
    System.out.println(name + " " + getClass().getSimpleName() + " is crawling around.");
  }
}
