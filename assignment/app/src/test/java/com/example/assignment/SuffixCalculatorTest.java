package com.example.assignment;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Test;

import java.io.IOException;

public class SuffixCalculatorTest {

    @Test
    public void numberIsSmallerThanTheLengthTest(){
        SuffixCalculator sc = new SuffixCalculator("Student",4);
        try {
            assertEquals(sc.eval(),"dent");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        @Test
        public void numberIsGreaterThanTheLengthTest() {
            SuffixCalculator sc = new SuffixCalculator("Calculate", 12);
            try {
                sc.eval();
                fail();
            } catch (IOException e) {
                assertEquals(e.getMessage(), "Number is greater than the length of the input.");
            }
        }
    @Test
    public void numberIsEqualToTheLengthTest() {
        SuffixCalculator sc = new SuffixCalculator("Teacher", 7);
        try {
            assertEquals(sc.eval(),"Teacher");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void numberIsEqualToZeroTest() {
        SuffixCalculator sc = new SuffixCalculator("Teacher", 0);
        try {
            assertEquals(sc.eval(),"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void numberIsSmallerThanZeroTest() {
        SuffixCalculator sc = new SuffixCalculator("Teacher", -5);
        try {
            sc.eval();
            fail();
        } catch (StringIndexOutOfBoundsException | IOException e) {
            assertThat(e.getMessage(), containsString("String index out of range: "));
        }
    }

    @Test
    public void firstArgumentEmptyTest(){
        SuffixCalculator sc = new SuffixCalculator("",4);
        try {
            sc.eval();
            fail();
        } catch (IOException e) {
            assertEquals(e.getMessage(), "Number is greater than the length of the input.");
        }
    }

}