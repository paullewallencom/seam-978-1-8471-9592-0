package com.davidsalter.vacationplanner.actions;

import org.jboss.seam.annotations.Install;
import org.jboss.seam.annotations.Name;

/**
 * Sample source code for Chapter 5 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Name("vacationManagerAction")
@Install(precedence=Install.MOCK)
public class MockVacationManagerAction {

	public String selectVacationType() throws Exception {
		return "danger";
	}
}
