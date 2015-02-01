package com.HW1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AntTest extends BaseTest {
  @Test
  public void shouldReturnAntName() {
    Ant ant = new Ant("Ant 1");
    assertEquals("Ant 1 Ant", ant.toString());
  }

  @Test
  public void shouldPrintAntMoves() {
    Ant ant = new Ant("Ant1");
    ant.move();
    assertEquals("Ant1 Ant is crawling around.", out.toString().trim());
  }

}
