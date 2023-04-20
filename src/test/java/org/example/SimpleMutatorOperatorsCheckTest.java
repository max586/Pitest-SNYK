package org.example;

import org.junit.jupiter.api.Test;

import static org.example.SimpleMutatorOperatorsCheck.*;
import static org.junit.jupiter.api.Assertions.*;

class SimpleMutatorOperatorsCheckTest {
    @Test
    void conditionalsBoundaryTest(){
        assertTrue(compareNumbers(0,1));
        assertFalse(compareNumbers(1,0));
    }

    @Test
    void incrementsTest(){
        assertEquals(10, increaseByTen(0));
    }

    @Test
    void mathTest(){
        assertEquals(10, multiplyByTen(1));
    }

    @Test
    void nullReturnsTest(){
        assertEquals(1, new A(1).getA());
    }

    @Test
    void contructorCallsTest() {
        assertEquals(new A(1),getA(1));
    }

    @Test
    void removeConditionalsTest() {
        assertEquals(11,sum(1,10));
    }
}