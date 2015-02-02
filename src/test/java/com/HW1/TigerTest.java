package com.HW1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TigerTest extends BaseTest{
  @Test
  public void shouldCreateTigerClass() {
    Tiger tiger = new Tiger("T1");
    assertEquals("T1 Tiger", tiger.toString());
  }

  @Test
  public void shouldPrintTigerMoves() {
    Tiger tiger = new Tiger("T1");
    tiger.move();
    assertEquals("T1 Tiger has just pounced.", out.toString().trim());
  }

  @Test
  public void shouldPrintMealInfoIfNotEmpty(){
    Tiger tiger = new Tiger("T1");
    tiger.doEat(new Thing("abc"));
    out.reset();
    tiger.whatDidYouEat();
    assertEquals("T1 Tiger has eaten a abc", out.toString().trim());
  }

  @Test
  public void shouldPrintGenericMessageIfMealInfoIsEmpty(){
    Tiger tiger = new Tiger("T1");
    out.reset();
    tiger.whatDidYouEat();
    assertEquals("T1 Tiger has had nothing to eat!", out.toString().trim());
  }
}
