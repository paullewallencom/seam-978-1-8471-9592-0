package com.davidsalter.enterprise.action;

import javax.ejb.Local;

/**
 * Sample source code for Chapter 11 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Local
public interface EmailManager {

    public String sendEmail();
}
