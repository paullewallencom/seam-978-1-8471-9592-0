package com.davidsalter.helloworld;

import javax.ejb.Stateless;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;

/**
 * Sample source code for Chapter 8 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Stateless
@Name("helloWorld")
public class HelloWorld implements HelloWorldAction {
    
    @Out
    @In(create=true)
    ForeName  foreName;

    public String sayHello() {
      return "Hello world !!";
   }

   public String sayHelloWithArgs(String name) {
      return "Hello "+name;
   }

   public String reverse() {
       foreName.reverse();
       return "";
   }

}