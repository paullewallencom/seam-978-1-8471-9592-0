package com.davidsalter.vacationplanner.actions.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Sample source code for Chapter 5 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
import com.davidsalter.vacationplanner.model.Destination;

public class DestinationTest {

	Destination destination = null;
	private static double TOLERANCE = 0.001;
		
	@BeforeClass
	public void setUp() {
		destination = new Destination();
		destination.setMinimumBudget(200.0);
	}
		
	@Test (groups= {"component"})
	public void testDestination() {
		assert destination.getMinimumBudget() - 200.0 < TOLERANCE;
	}

}