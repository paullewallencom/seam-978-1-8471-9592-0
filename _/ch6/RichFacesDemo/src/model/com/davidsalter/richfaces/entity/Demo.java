package com.davidsalter.richfaces.entity;

import java.io.Serializable;
import java.util.Date;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

/**
 * Sample source code for Chapter 6 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@SuppressWarnings("serial")
@Name("demo")
@Scope(ScopeType.SESSION)
public class Demo implements Serializable {

    private Date theDate;

    /**
     * @return the theDate
     */
    public Date getTheDate() {
        return theDate;
    }

    /**
     * @param theDate the theDate to set
     */
    public void setTheDate(Date theDate) {
        this.theDate = theDate;
    }


}
