package com.HW1.acceptance;

import com.HW1.Thing;
import com.HW1.Tiger;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class TestCreature {

    public TestCreature() {

    }

    public static final int THING_COUNT = 10;
    public static final int CREATURE_COUNT = 5;

    public static void main(java.lang.String[] args) {
        ArrayList<Thing> things = new ArrayList<>();
        IntStream.range(0, 5).forEach(i -> things.add(new Thing("Thing" + i)));
        IntStream.range(6, THING_COUNT).forEach(i -> things.add(new Tiger("Tiger" + i)));
        things.stream().forEach(System.out::println);
    }
}
