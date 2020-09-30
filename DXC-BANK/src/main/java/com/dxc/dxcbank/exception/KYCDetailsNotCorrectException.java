package com.dxc.dxcbank.exception;

public class KYCDetailsNotCorrectException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public KYCDetailsNotCorrectException(String message) {
	super(message);
    }

}
