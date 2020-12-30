package com.davidsalter.seamcalculator;

import javax.ejb.Stateless;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Name;

/**
 * Sample source code for Chapter 2 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Stateless
@Name("calcAction")
public class CalcAction implements Calc {

    @In
    @Out
    private Calculator calculator;

    public String calculate() {

        calculator.add();
        return "";

    }
}
