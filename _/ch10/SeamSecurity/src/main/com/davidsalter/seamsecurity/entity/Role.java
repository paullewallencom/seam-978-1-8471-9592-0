package com.davidsalter.seamsecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.jboss.seam.annotations.security.management.RoleName;

/**
 * Sample source code for Chapter 10 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Entity
public class Role {

    private Integer id;
    private String name;

    @Id
    @GeneratedValue
    @Column(name="ROLE_ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @RoleName
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
