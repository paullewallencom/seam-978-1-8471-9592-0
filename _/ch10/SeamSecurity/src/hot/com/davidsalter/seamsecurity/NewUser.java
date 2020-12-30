package com.davidsalter.seamsecurity;

import javax.ejb.Local;

/**
 * Sample source code for Chapter 10 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Local
interface NewUser {

    public String createUser();

}
