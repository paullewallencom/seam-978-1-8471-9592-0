package com.davidsalter.conversation.action;

import javax.ejb.Local;

/**
 * Sample source code for Chapter 8 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Local
public interface HitCount {

    public String start();

    public String increment();

    public String end();
    
    public void destroy();
    
    public int getCount();
    
    public void setCount(int count);
    public int getId();
    
    public void setId(int count);
    
    public String placeBid();
}
