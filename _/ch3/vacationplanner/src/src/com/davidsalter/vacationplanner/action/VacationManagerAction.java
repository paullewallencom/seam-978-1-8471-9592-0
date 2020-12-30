package com.davidsalter.vacationplanner.action;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.PersistenceException;

import com.davidsalter.vacationplanner.model.Destination;

import org.jboss.seam.annotations.Destroy;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;

/**
 * Sample source code for Chapter 3 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Name("vacationManagerAction")
@Stateful
public class VacationManagerAction implements VacationManager {

	@In
	Destination destination;
	
	@Logger
	private Log log;
	
	public String selectVacationType() throws Exception {
		log.debug("DestinationType: ", destination.getDestinationType());
		if (destination.getDestinationType() == Destination.DestinationType.ACTION)
			return "danger";
		else if (destination.getDestinationType() == Destination.DestinationType.BEACH)
			return "beach";
		else if (destination.getDestinationType() == Destination.DestinationType.CITY)
			return "/city.jsp";
		else
			throw new Exception("Oops");
	}
	
	public void beforeRender() {
		log.info("Just about to render the page.");
	}
	
	@Remove
	@Destroy
	public void remove() {
	}
}