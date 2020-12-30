package com.davidsalter.enterprise.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

/**
 * Sample source code for Chapter 11 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

public class CustomerTest extends SeamTest {

	@Test
	public void test_customer() throws Exception {
		new FacesRequest() {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{Customer.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{Customer.customer}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{Customer.value}").equals("seam");
			}
		}.run();
	}
}
