package com.HW1.acceptance;

import com.HW1.*;

import java.util.ArrayList;

public class TestCreature {

  public TestCreature() {
  }

  public static final int THING_COUNT = 10;

  public static void main(java.lang.String[] args) {

    ArrayList<Thing> things = new ArrayList<>();
    for (int counter = 0 ; counter < 5 ; counter ++)
      things.add(new Thing("Thing" + counter));

    for (int counter = 5 ; counter < THING_COUNT ; counter ++)
      things.add(new Tiger("Tiger" + counter));

    for (Thing thing : things) {
      System.out.println(thing);
    }
    things.clear();

    things.add(new Thing("Banana"));
    things.add(new Thing("Tigger, Pooh's Friend"));
    things.add(new Thing("Locomotive"));
    things.add(new Thing("Tick-Tock the Crocodile"));
    System.out.println("\nThings: ");
    for (Thing thing : things) {
      System.out.println(thing);
    }

    ArrayList<Creature> creatures = new ArrayList<>();
    creatures.add(new Tiger("Pooh's Friend"));
    creatures.add(new Ant("Tick Tock"));
    System.out.println("\nCreatures: ");
    for (Creature creature : creatures) {
      System.out.println(creature);
    }
    System.out.println("\n");

    Thing thing = new Thing("Thing 1");
    Tiger tiger = new Tiger("Creature 1");
    creatures.add(tiger);

    Ant ant = new Ant("Ant 1");
    ant.doEat(tiger);
    ant.doEat(thing);
    creatures.add(ant);

    System.out.println("\n");

    Fly fly = new Fly("Fly 1");
    fly.eat(thing);
    fly.eat(tiger);
    creatures.add(fly);

    System.out.println("\n");

    Bat bat = new Bat("Bat 1");
    bat.eat(thing);
    bat.eat(tiger);
    bat.eat(ant);
    creatures.add(bat);

    System.out.println("\n");

    for (Creature creature : creatures) {
      creature.move();
    }
  }
}
