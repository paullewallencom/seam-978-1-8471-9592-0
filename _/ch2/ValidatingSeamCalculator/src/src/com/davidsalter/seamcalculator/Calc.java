package com.davidsalter.seamcalculator;

import javax.ejb.Local;

/**
 * Sample source code for Chapter 2 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Local
public interface Calc {

    public String calculate();
}
