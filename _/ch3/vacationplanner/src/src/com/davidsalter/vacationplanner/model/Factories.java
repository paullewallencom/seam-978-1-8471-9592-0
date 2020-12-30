package com.davidsalter.vacationplanner.model;

import com.davidsalter.vacationplanner.model.Destination.DestinationType;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;

/**
 * Sample source code for Chapter 3 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Name("factories")
public class Factories {

	@Factory("destinationTypes")
	public DestinationType[] getDestinationTypes() {
		return DestinationType.values();
	}

}
