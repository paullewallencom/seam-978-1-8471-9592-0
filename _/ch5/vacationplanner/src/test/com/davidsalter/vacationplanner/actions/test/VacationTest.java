package com.davidsalter.vacationplanner.actions.test;

import org.jboss.seam.mock.SeamTest;
import org.testng.annotations.Test;
import com.davidsalter.vacationplanner.model.Destination;

/**
 * Sample source code for Chapter 5 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
public class VacationTest extends SeamTest {

	@Test(groups={"ui"})
	public void testCityVacation() throws Exception {
	
		new FacesRequest() {
		
			@Override
			protected void processValidations() throws Exception {
            	validateValue("#{destination.destinationType}", Destination.DestinationType.CITY);
            	validateValue("#{destination.minimumBudget}", 200.0);
            	assert !isValidationFailure();
         	}
         
         	@Override
         	protected void updateModelValues() throws Exception {
				setValue("#{destination.destinationType}", Destination.DestinationType.CITY);
            	setValue("#{destination.minimumBudget}", 200.0);
         	}

         	@Override
         	protected void invokeApplication() {
            	assert invokeMethod("#{vacationManagerAction.selectVacationType}").equals("/city.xhtml");
         	}

         	@Override
         	protected void renderResponse() {
         		assert getValue("#{destination.minimumBudget}").toString().equals("200.0");
         	}
         
		
		}.run();
	
	}

	@Test
	public void testActionLittleFunds() throws Exception {
	
		new FacesRequest() {
		
			@Override
			protected void processValidations() throws Exception {
            	validateValue("#{destination.destinationType}", Destination.DestinationType.ACTION);
            	validateValue("#{destination.minimumBudget}", 1.0);
            	assert !isValidationFailure();
         	}
         
         	@Override
         	protected void updateModelValues() throws Exception {
				setValue("#{destination.destinationType}", Destination.DestinationType.ACTION);
            	setValue("#{destination.minimumBudget}", 1.0);
         	}

         	@Override
         	protected void invokeApplication() {
            	assert invokeMethod("#{vacationManagerAction.selectVacationType}").equals("danger");
         	}

         	@Override
         	protected void renderResponse() {
//         	System.out.println(getViewId());
         		assert getValue("#{destination.minimumBudget}").toString().equals("1.0");
         	}
         
		
		}.run();
	
	}

	@Test
	public void testNoVacationSelected() throws Exception {
	
		new FacesRequest() {
		
         	@Override
         	protected void updateModelValues() throws Exception {
            	setValue("#{destination.minimumBudget}", 1.0);
         	}

         	@Override
         	protected void invokeApplication() {
            	assert invokeMethod("#{vacationManagerAction.selectVacationType}") != null;
         	}

         
		
		}.run();
	
	}


}