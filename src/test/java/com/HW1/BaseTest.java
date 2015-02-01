package com.HW1;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BaseTest {
  private PrintStream printStream;
  protected ByteArrayOutputStream out;

  @Before
  public void setSysOut() {
    printStream = System.out;
    out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
  }

  @After
  public void restoreSysOut() {
    System.setOut(printStream);
  }

}
