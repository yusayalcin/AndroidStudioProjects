package com.example.mytestingapplication2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulerTest {

    @Test
    public void eval() {
    Muler m = new Muler(1,2);
    assertEquals(java.util.Optional.ofNullable(m.eval()), 1*2);
    }
}