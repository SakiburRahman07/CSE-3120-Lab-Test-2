package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void test1()
    {
        Calculator c = new Calculator();
        assertEquals(4,c.add(2,2) );
    }

    @Test
    void test2()
    {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class, ()->
        {
            c.negativenumber(-7);
        });
    }

}