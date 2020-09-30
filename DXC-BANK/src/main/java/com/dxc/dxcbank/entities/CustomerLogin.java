package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false, updatable = true)
    private String userId;

    @Column(nullable = false, updatable = true)
    private String password;

    /**
     * @return the userId
     */
    public String getUserId() {
	return userId;
    }

    /**
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
	this.userId = userId;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

    @Override
    public String toString() {
	return "CustomerLogin [" + (userId != null ? "userId=" + userId + ", " : "")
		+ (password != null ? "password=" + password : "") + "]";
    }

}
