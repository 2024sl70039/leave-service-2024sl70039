package com.bits.hr;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LeaveCalculatorTest {
    LeaveCalculator calc = new LeaveCalculator();
    @Test
    public void testRemainingLeave() {
        assertEquals(10, calc.getRemainingLeave(30, 20));
    }
    @Test
    public void testEncashmentAmount() {
        assertEquals(25000.0, calc.getEncashmentAmount(10, 2500.0), 0.01);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidLeave() {
        calc.getRemainingLeave(10, 20);
    }
}

