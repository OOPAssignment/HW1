package com.HW1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlyTest extends BaseTest {
  @Test
  public void shouldReturnFlyName() {
    Fly fly = new Fly("fly 1");
    assertEquals("fly 1 Fly", fly.toString());
  }

  @Test
  public void shouldPrintFlyMoves() {
    Fly fly = new Fly("fly2");
    fly.move();
    assertEquals("fly2 Fly is buzzing around in flight.", out.toString().trim());
  }

  @Test
  public void shouldEatThingsOnly() {
    Thing thing = new Thing("thing 1");
    Fly fly = new Fly("Fly3");
    fly.doEat(thing);
    assertEquals("Fly3 has eaten a thing 1", out.toString().trim());
  }

  @Test
  public void shouldNotEatCreature() {
    Tiger tiger = new Tiger("Tiger 1");
    Fly fly = new Fly("Fly3");
    fly.doEat(tiger);
    assertEquals("Fly3 Fly won't eat a Tiger 1 Tiger", out.toString().trim());
  }
}
