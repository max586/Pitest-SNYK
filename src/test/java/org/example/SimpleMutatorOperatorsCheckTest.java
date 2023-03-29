package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.example.SimpleMutatorOperatorsCheck.*;
import static org.junit.jupiter.api.Assertions.*;

class SimpleMutatorOperatorsCheckTest {
    @Test
    void conditionalsBoundaryTest(){
        assertTrue(compareNumbers(0,1));
        assertFalse(compareNumbers(1,0));
        //assertTrue(conditionalsBoundary(1,1));
    }

    @Test
    void emptyReturnsTest() {
        assertTrue(sortList(new ArrayList<Integer>()).isEmpty());
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