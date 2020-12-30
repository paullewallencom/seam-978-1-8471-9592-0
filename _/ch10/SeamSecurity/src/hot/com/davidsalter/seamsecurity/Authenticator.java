package com.davidsalter.seamsecurity;

import com.davidsalter.seamsecurity.entity.Role;
import com.davidsalter.seamsecurity.entity.User;
import javax.persistence.EntityManager;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

/**
 * Sample source code for Chapter 10 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Name("authenticator")
public class Authenticator {


    @Logger
    private Log log;
    @In
    private Identity identity;
    @In
    private Credentials credentials;
    @In
    private EntityManager entityManager;

    private final String query="from User where username=:username and password = :password and enabled=true";

    public boolean authenticate() {
        log.debug("Authenticating username:"+ credentials.getUsername());
        try {
            User result = (User)entityManager.createQuery(query)
                    .setParameter("username", credentials.getUsername())
                    .setParameter("password", credentials.getPassword())
                    .getSingleResult();

            if (result.getRoles() != null) {
                for (Role role : result.getRoles()) {
                    identity.addRole(role.getName());
                }
            }
            log.debug("Authentication successful:"+credentials.getUsername());
            return true;
        } catch (Exception e) {
            log.debug("Failed to authenticate user:"+ credentials.getUsername());
            return false;
        }
    }

}
