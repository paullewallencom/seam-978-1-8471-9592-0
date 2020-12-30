package com.davidsalter.vacationplanner.action;

import javax.ejb.Local;

/**
 * Sample source code for Chapter 3 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Local
public interface VacationManager {

	public void beforeRender();
    public String selectVacationType() throws Exception;

    public void remove();
}
