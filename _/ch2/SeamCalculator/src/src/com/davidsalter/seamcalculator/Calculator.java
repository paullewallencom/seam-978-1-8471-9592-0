package com.davidsalter.seamcalculator;

import java.io.Serializable;

import org.jboss.seam.annotations.Name;

/**
 * Sample source code for Chapter 2 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Name("calculator")
public class Calculator {

    private double value1;
    private double value2;
    private double answer;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double getAnswer() {
        return answer;
    }

    public void add() {
        this.answer = value1 + value2;
    }
}