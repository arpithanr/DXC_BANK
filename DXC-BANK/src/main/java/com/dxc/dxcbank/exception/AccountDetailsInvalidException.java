package com.dxc.dxcbank.exception;

public class AccountDetailsInvalidException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AccountDetailsInvalidException(String message) {
	super(message);
    }

}
