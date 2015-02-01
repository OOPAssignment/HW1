package com.HW1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TigerTest {
  @Test
  public void shouldCreateTigerClass() {
    Tiger tiger = new Tiger("T1");
    assertEquals("T1 Tiger", tiger.toString());
  }
}
