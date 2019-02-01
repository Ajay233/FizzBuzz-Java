package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void fizz(){
        assertEquals("Fizz", Main.fizz(6));
    }

    @Test
    public void buzz(){
        assertEquals("Buzz", Main.buzz(10));
    }

    @Test
    public void fizzBuzz(){
        assertEquals("FizzBuzz", Main.fizzBuzz(15));
    }

    @Test
    public void fizzBuzzJava(){
        // This is the result we expect to be returned
        String[] exp = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7",
                           "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
                           "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        // output from the method is being assigned to a string array called result
        String[] result = Main.fizzBuzzJava(20);
        assertArrayEquals(result, exp);
    }




}


