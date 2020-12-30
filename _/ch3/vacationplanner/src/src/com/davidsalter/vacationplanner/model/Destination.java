package com.davidsalter.vacationplanner.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import org.jboss.seam.annotations.Name;

/**
 * Sample source code for Chapter 3 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Name("destination")
public class Destination implements Serializable {
    
    public enum DestinationType {
    	ACTION("Action"), BEACH("Beach"), CITY("City");
    	
    	private String label;
    	
    	DestinationType(String label) {
    		this.label = label;
    	}
    	
    	public String getLabel() {
    		return label;
    	}
    }
    
    private double minimumBudget;
    
    @Enumerated(EnumType.STRING)
    private DestinationType destinationType;
    
    public DestinationType getDestinationType() {
		return destinationType;
	}
	
	public void setDestinationType(DestinationType type) {
		this.destinationType = type;
	}

	public double getMinimumBudget() {
		return minimumBudget;
	}

	public void setMinimumBudget(double minimumBudget) {
		this.minimumBudget = minimumBudget;
	}
}
