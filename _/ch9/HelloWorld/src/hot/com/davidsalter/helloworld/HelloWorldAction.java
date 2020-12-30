package com.davidsalter.helloworld;

import javax.ejb.Local;
import org.jboss.seam.annotations.remoting.WebRemote;

/**
 * Sample source code for Chapter 8 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Local
public interface HelloWorldAction {

    @WebRemote
    public String sayHello();

    @WebRemote
    public String sayHelloWithArgs(String name);

    public String reverse();
}
