package com.davidsalter.data.actions;

import javax.ejb.Local;

/**
 * Sample source code for Chapter 7 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Local
public interface CustomerManager {

    public void getCustomers();
    public void getTelephoneNumbers();
    public void view();

    public void destroy();

}
