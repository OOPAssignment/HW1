package com.HW1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatTest extends BaseTest {
  @Test
  public void shouldReturnBatName() {
    Bat bat = new Bat("Bat1");
    assertEquals("Bat1 Bat", bat.toString());
  }

  @Test
  public void shouldPrintFlyMoves() {
    Bat bat = new Bat("Bat1");
    bat.move();
    assertEquals("Bat1 Bat is swooping through the dark.", out.toString().trim());
  }

  @Test
  public void shouldNotEatThings() {
    Thing thing = new Thing("Thing1");
    Bat bat = new Bat("Bat1");
    bat.doEat(thing);
    assertEquals("Bat1 Bat won't eat a Thing1", out.toString().trim());
  }


  @Test
  public void shouldEatCreatureOnly() {
    Tiger tiger = new Tiger("Tiger 1");
    Bat bat = new Bat("Bat1");
    bat.doEat(tiger);
    assertEquals("Bat1 has eaten a Tiger 1 Tiger", out.toString().trim());
  }
}
