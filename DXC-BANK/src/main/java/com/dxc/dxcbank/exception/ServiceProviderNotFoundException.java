package com.dxc.dxcbank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ServiceProviderNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ServiceProviderNotFoundException(int serviceProviderID) {
	super("Service Provider With ID " + serviceProviderID + " Not Found..");
    }

}
