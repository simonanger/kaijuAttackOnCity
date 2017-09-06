package com.example.simonanger.kaijuattackoncity;

import com.example.simonanger.kaijuattackoncity.kaiju.Gigan;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by simonanger on 06/09/2017.
 */

public class GiganTest {

    @Test
    public void testCanRoar() {
        Gigan gigan = new Gigan("Big John", 380, 75);
        assertEquals("Roooooaaaar", gigan.roar());

    }

    @Test
    public void testGetName() {
        Gigan gigan = new Gigan("Big John", 380, 75);
        assertEquals("Big John", gigan.getName());
    }

    @Test
    public void testGetHealthValue() {
        Gigan gigan = new Gigan("Big John", 380, 75);
        assertEquals(380, gigan.getHealthValue());
    }

    @Test
    public void testGetAttackValue() {
        Gigan gigan = new Gigan("Big John", 380, 75);
        assertEquals(75, gigan.getAttackValue());
    }
}
