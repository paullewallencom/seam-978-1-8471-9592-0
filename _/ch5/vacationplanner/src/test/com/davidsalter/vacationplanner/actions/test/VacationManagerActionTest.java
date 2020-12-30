package com.davidsalter.vacationplanner.actions.test;

import org.jboss.seam.mock.SeamTest;
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

public class VacationManagerActionTest extends SeamTest {
	
	@Test
	public void testSelectVacationType() throws Exception {
		new ComponentTest() {
			
			@Override
			protected void testComponents() throws Exception {
				setValue("#{destination.destinationType}", Destination.DestinationType.ACTION);
				assert invokeMethod("#{vacationManagerAction.selectVacationType}").equals("danger");
			}
		}.run();
	}

}
