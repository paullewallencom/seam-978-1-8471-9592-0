package com.davidsalter.richfaces.actions;

import com.davidsalter.richfaces.entity.Country;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import org.jboss.seam.annotations.Factory;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.datamodel.DataModel;

/**
 * Sample source code for Chapter 6 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Stateful
@Name("tableAction")
public class TableDemoAction implements TableDemo {

    @DataModel
    private List<Country>countries = null;

    @Factory("countries")
    public void countryList() {
        if (countries==null) {
            countries = new ArrayList<Country>();
            countries.add(new Country("China", "Beijing", 1325000000));
            countries.add(new Country("France", "Paris", 65000000));
            countries.add(new Country("Germany", "Berlin", 82000000));
            countries.add(new Country("India", "New Delhi", 1140000000));
            countries.add(new Country("Ireland", "Dublin", 4500000));
            countries.add(new Country("Italy", "Rome", 60000000));
            countries.add(new Country("Spain", "Madrid", 46000000));
            countries.add(new Country("United Kingdom", "London", 61000000));
            countries.add(new Country("United States", "Washington DC", 300000000));
        }
    }

    @Remove
    public void remove() {

    }
}
