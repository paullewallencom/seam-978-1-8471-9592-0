package com.davidsalter.enterprise.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Version;
import org.hibernate.validator.Length;

/**
 * Sample source code for Chapter 11 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Entity
public class Customer implements Serializable
{
    private Long id;
    private Integer version;
    private String foreName;
    private String secondName;


    @Id @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Version
    public Integer getVersion() {
        return version;
    }

    private void setVersion(Integer version) {
        this.version = version;
    }

    @Length(max = 20)
    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    @Length(max = 20)
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
