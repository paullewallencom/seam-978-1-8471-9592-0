package com.davidsalter.seamsecurity;

import com.davidsalter.seamsecurity.entity.User;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.security.management.IdentityManager;

/**
 * Sample source code for Chapter 10 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Name("newUserManager")
public class NewUserManager implements NewUser {

    @In
    private IdentityManager identityManager;
    @In
    User user;

    public String createUser() {
        identityManager.createUser(user.getUserName(), "password");
        identityManager.grantRole(user.getUserName(), "user");
        return "created";
    }

}
