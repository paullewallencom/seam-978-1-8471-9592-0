package com.davidsalter.seamcalculator.test;

import com.davidsalter.seamcalculator.Calculator;
import org.testng.annotations.Test;

public class CalculatorTest {

    private static double tolerance = 0.001;

    @Test
    public void testAdd() throws Exception {
        Calculator testCalculator = new Calculator();
        testCalculator.setValue1(10.0);
        testCalculator.setValue2(20.0);
        testCalculator.add();
        assert (testCalculator.getAnswer() - 30.0 < tolerance);
    }
}
