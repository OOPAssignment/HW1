package com.HW1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThingTest {
    @Test
    public void shouldReturnNameOfThingIfClassIsTypeOfThing(){
        String thingName = "ABC";
        Thing thing = new Thing(thingName);
        assertEquals(thingName, thing.toString());
    }

    @Test
    public void shouldReturnNameOfThingAndClassNameIfClassIsNotTypeOfThing(){
        String thingName = "ABC";
        Tiger tiger = new Tiger("ABC");
        assertEquals(thingName + " Tiger", tiger.toString());
    }
}

