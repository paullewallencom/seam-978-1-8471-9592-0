package com.davidsalter.enterprise.action;

import java.util.Map;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Observer;
import org.jboss.seam.log.Log;

/**
 * Sample source code for Chapter 11 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Name("eventListener")
public class EventListener {

    @Logger
    private Log log;

    @In
    private Map<String, String> messages;

    @Observer("customerCreated")
    public void customerCreated() {
        log.info("New customer created.");
    }


    @Observer("customerCreatedParams")
    public void customerCreatedParams(String surname) {
        log.info(messages.get("surname") + ":"+surname);
    }
}
