package com.example.simonanger.kaijuattackoncity;

import com.example.simonanger.kaijuattackoncity.kaiju.Otachi;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by simonanger on 06/09/2017.
 */

public class OtachiTest {

    @Test
    public void testCanRoar(){
        Otachi otachi = new Otachi("Steve", 200, 50);
        assertEquals("Aaaaaaccchhhhhhh", otachi.roar() );
    }

    @Test
    public void testHasName(){
        Otachi otachi = new Otachi("Steve", 200, 50);
        assertEquals("Steve", otachi.getName() );
    }

    @Test
    public void testHealthValue(){
        Otachi otachi = new Otachi("Steve", 200, 50);
        assertEquals(200, otachi.getHealthValue() );
    }

    @Test
    public void testAttackValue(){
        Otachi otachi = new Otachi("Steve", 200, 50);
        assertEquals(50, otachi.getAttackValue() );
    }


}
