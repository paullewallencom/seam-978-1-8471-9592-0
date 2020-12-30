package com.davidsalter.enterprise.action;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import com.davidsalter.enterprise.entity.Customer;
import org.jboss.seam.annotations.RaiseEvent;
import org.jboss.seam.core.Events;

/**
 * Sample source code for Chapter 11 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Name("customerHome")
public class CustomerHome extends EntityHome<Customer>
{
    @RequestParameter Long customerId;

    @Override
    public Object getId()
    {
        if (customerId == null)
        {
            return super.getId();
        }
        else
        {
            return customerId;
        }
    }

    @Override @Begin
    public void create() {
        super.create();
    }

    @Override
    @RaiseEvent("customerCreated" )
    public String persist() {
        Events.instance().raiseEvent("customerCreatedParams", this.instance.getSecondName());
        Events.instance().raiseAsynchronousEvent("customerCreatedParams", "Async");
        return super.persist();
    }

}
