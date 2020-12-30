package com.davidsalter.seamcalculator.test;

import com.davidsalter.seamcalculator.Calculator;
import org.testng.annotations.Test;

/**
 * Sample source code for Chapter 2 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
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
