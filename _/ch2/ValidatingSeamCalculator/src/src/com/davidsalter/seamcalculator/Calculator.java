package com.davidsalter.seamcalculator;

import java.io.Serializable;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.faces.FacesMessages;
import org.hibernate.validator.Max;
import org.hibernate.validator.Min;
import org.hibernate.validator.Range;
import org.hibernate.validator.Digits;

/**
 * Sample source code for Chapter 2 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Name("calculator")
public class Calculator implements Serializable {

    private double value1;
    private double value2;
    private double answer;

    @Min(value=0, message="Min=0")
    @Max(value=100, message="Max=100")
    @Digits(integerDigits=3, message="Please enter the correct number of digits")
    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    @Digits(integerDigits=3)
    @Range(min=0, max=100)
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
        
        //Access the "org.jboss.seam.faces.facesMessages" component and add a message into it.
        FacesMessages.instance().add("Phew, that was a lot of maths !!");
    }
}