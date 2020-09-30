package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(unique = true, nullable = false, updatable = true)
    private String adminId;

    @Column(nullable = false, updatable = true)
    private String password;

    /**
     * @return the adminId
     */
    public String getAdminId() {
	return adminId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param adminId the adminId to set
     */
    public void setAdminId(String adminId) {
	this.adminId = adminId;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public String toString() {
	return "AdminLogin [adminId=" + adminId + ", password=" + password + "]";
    }

}
