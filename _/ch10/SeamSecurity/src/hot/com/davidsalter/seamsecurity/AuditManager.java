package com.davidsalter.seamsecurity;

import com.davidsalter.seamsecurity.entity.LoginAudit;
import javax.persistence.EntityManager;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Observer;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;

/**
 * Sample source code for Chapter 10 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Name("auditManager")
public class AuditManager {


    @Logger
    private Log log;
    @In
    private Credentials credentials;
    @In
    private EntityManager entityManager;

    @Observer("org.jboss.seam.security.loginSuccessful")
    public void onSuccessFulLogin() {
        log.info("Audit: Successful login for "+credentials.getUsername());
        LoginAudit audit = new LoginAudit();
        audit.setStatus("Success");
        audit.setUserName(credentials.getUsername());
        entityManager.persist(audit);
    }

    @Observer("org.jboss.seam.security.loginFailed")
    public void onFailedLogin() {
        log.info("Audit: Failed login for "+credentials.getUsername());
        LoginAudit audit = new LoginAudit();
        audit.setStatus("Fail");
        audit.setUserName(credentials.getUsername());
        entityManager.persist(audit);
    }
}
