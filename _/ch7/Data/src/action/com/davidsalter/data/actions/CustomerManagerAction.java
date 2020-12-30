package com.davidsalter.data.actions;

import com.davidsalter.data.entity.Customer;
import com.davidsalter.data.entity.TelephoneNumber;
import java.util.List;
import java.util.Set;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.seam.annotations.Destroy;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.datamodel.DataModel;
import org.jboss.seam.annotations.datamodel.DataModelSelection;
import org.jboss.seam.log.Log;

/**
 * Sample source code for Chapter 7 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Stateful
@Name("customerManager")
public class CustomerManagerAction implements CustomerManager {

    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings("unused")
	@DataModel
    private List<Customer> customers;
    @DataModelSelection("customers")
    @Out(required = false)
    private Customer selectedCustomer;
    @SuppressWarnings("unused")
	@DataModel
    private Set<TelephoneNumber> telephoneNumbers;
    @SuppressWarnings("unused")
	@DataModelSelection("telephoneNumbers")
    private TelephoneNumber selectedTelephoneNumber;

    @Logger Log log;

    @SuppressWarnings("unchecked")
	@Factory
    public void getCustomers() {
        customers = em.createQuery("select customer from Customer customer order by customer.secondName").getResultList();
    }

    @Factory
    public void getTelephoneNumbers() {
        if (selectedCustomer != null) {
            telephoneNumbers = selectedCustomer.getTelephoneNumbers();
        }
    }

    public void view() {
    	log.info("Selected customer:" + selectedCustomer.getForeName());
        log.info(selectedCustomer.getTelephoneNumbers().size());
        Customer customer = em.find(Customer.class, 5L);
    }

    @Destroy
    @Remove
    public void destroy() {
    }
}
