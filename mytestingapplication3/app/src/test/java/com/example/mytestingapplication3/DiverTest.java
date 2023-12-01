package com.example.mytestingapplication3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import java.io.IOException;

public class DiverTest {

    @Test
    public void testEval(){
        Diver d1 = new Diver(1,2);
        try{
            assert(1/2 == d1.eval());
        } catch (IOException e) {
            fail();
        }

        Diver d2 = new Diver(1,0);
        try{
            d2.eval();
            fail();
        } catch (IOException e) {
            assertEquals(e.getMessage(), "Zero div");
        }
    }
}
