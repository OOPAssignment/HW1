package com.HW1.acceptance;

import com.HW1.*;

import java.util.ArrayList;

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

    Thing thing = new Thing("Thing 1");
    Tiger tiger = new Tiger("Creature 1");
    Ant ant = new Ant("Ant 1");

    ant.doEat(tiger);
    ant.doEat(thing);
    ant.move();

    Fly fly = new Fly("Fly 1");
    fly.doEat(thing);
    fly.doEat(tiger);
    fly.move();

    Bat bat = new Bat("Bat 1");
    bat.doEat(thing);
    bat.doEat(tiger);
    bat.doEat(ant);
    bat.move();
  }
}
