package com.davidsalter.seamsecurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.jboss.seam.annotations.security.permission.PermissionAction;
import org.jboss.seam.annotations.security.permission.PermissionRole;
import org.jboss.seam.annotations.security.permission.PermissionTarget;

/**
 * Sample source code for Chapter 10 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */

@Entity
public class Permission {
    private Integer id;
    private String target;
    private String action;
    private String role;

    @Id
    @GeneratedValue
    @Column(name="PERMISSION_ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @PermissionAction
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @PermissionRole
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @PermissionTarget
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
