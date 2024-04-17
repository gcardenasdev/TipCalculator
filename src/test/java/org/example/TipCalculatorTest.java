package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipCalculatorTest {

    @Test
    void tipPerPerson() {
        assertEquals(6, TipCalculator.tipPerPerson(200, 15, 5));
    }

    @Test
    void totalPerPerson() {
        assertEquals(46, TipCalculator.totalPerPerson(200, 6, 5));
    }
}