package com.davidsalter.enterprise.action;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import com.davidsalter.enterprise.entity.Customer;

/**
 * Sample source code for Chapter 11 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Name("customerList")
public class CustomerList extends EntityQuery<Customer>
{
    public CustomerList()
    {
        setEjbql("select customer from Customer customer");
    }
}
