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
}
