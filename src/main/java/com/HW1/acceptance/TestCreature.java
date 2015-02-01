package com.HW1.acceptance;

import com.HW1.Ant;
import com.HW1.Creature;
import com.HW1.Thing;
import com.HW1.Tiger;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class TestCreature {

  public TestCreature() {
  }

  public static void main(java.lang.String[] args) {
    ArrayList<Thing> things = new ArrayList<>();
    things.add(new Thing("Banana"));
    things.add(new Thing("Tigger, Pooh's Friend"));
    things.add(new Thing("Locomotive"));
    things.add(new Thing("Tick-Tock the Crocodile"));
    System.out.println("Things: ");
    things.stream().forEach(System.out::println);

    ArrayList<Creature> creatures = new ArrayList<>();

    creatures.add(new Tiger("Pooh's Friend"));
    creatures.add(new Ant("Tick Tock"));
    System.out.println("Creatures: ");
    creatures.stream().forEach(System.out::println);
  }
}
