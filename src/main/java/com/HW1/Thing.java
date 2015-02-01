package com.HW1;

public class Thing {
  private String name;

  public Thing(String name) {
    this.name = name;
  }

  public String toString() {
    String className = getClass().getSimpleName();
    return className.equals(Thing.class.getSimpleName()) ? name : name + " " + className;
  }
}
