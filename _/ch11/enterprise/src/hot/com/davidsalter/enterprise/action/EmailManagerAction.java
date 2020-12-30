package com.davidsalter.enterprise.action;

import com.davidsalter.enterprise.entity.EmailDetails;
import javax.ejb.Stateless;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.faces.Renderer;

/**
 * Sample source code for Chapter 11 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Stateless
@Name("emailManager")
@Scope(ScopeType.SESSION)
public class EmailManagerAction implements EmailManager {

    @In
    private Renderer renderer;

    @Out
    private EmailDetails emailDetails;

    public EmailDetails getEmailDetails() {
        return emailDetails;
    }

    public void setEmailDetails(EmailDetails emailDetails) {
        this.emailDetails = emailDetails;
    }


    public String sendEmail() {
        emailDetails = new EmailDetails();
        emailDetails.setFrom("somebody@somedomain.com");
        emailDetails.setTo("someone@somewhere.com");
        emailDetails.setFromName("Enterprise App (unatended mail box)");
        emailDetails.setToName("Some Person");
        renderer.render("/email.xhtml");

        return "/emailSent.xhtml";
    }


}
