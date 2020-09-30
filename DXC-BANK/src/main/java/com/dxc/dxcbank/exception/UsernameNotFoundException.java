package com.dxc.dxcbank.exception;

public class UsernameNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * @param message
     */
    public UsernameNotFoundException(String username) {
	super("Username " + username + " Not Found..");
    }

    
}
