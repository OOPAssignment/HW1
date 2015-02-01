package com.HW1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThingTest {
    @Test
    public void shouldReturnNameOfThing(){
        String thingName = "ABC";
        Thing thing = new Thing(thingName);
        assertEquals(thingName, thing.toString());
    }
}

