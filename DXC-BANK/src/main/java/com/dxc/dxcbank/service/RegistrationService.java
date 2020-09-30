package com.dxc.dxcbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.Registration;
import com.dxc.dxcbank.exception.RegistrationException;
import com.dxc.dxcbank.repository.IRegistrationRepository;

@Service
public class RegistrationService implements IRegistrationService {

    @Autowired
    private IRegistrationRepository iRegistrationRepository;

    @Override
    public Registration customerRegistration(Registration registration) throws RegistrationException {

	Registration isValid = validateRegistration(registration);

	if (isValid != null) {
	    return iRegistrationRepository.save(registration);
	} else {
	    throw new RegistrationException("Registration Failed..");
	}
	
    }

    // Validation of Registration properties
    private Registration validateRegistration(Registration registration) {

	if ((registration.getFirstName().length() >= 3)
		&& registration.getAccountType() != null
		&& registration.getAddressLine1() != null && registration.getCity() != null
		&& registration.getNation() != null && registration.getState() != null
		&& (registration.getEmail() != null
		&& (registration.getContactNumber() >= 1000000000L &&
		    registration.getContactNumber() <= 9999999999L))) {

	    return registration;
	}
	return null;
    }
    
}
/*
 * (registration.getAccountType() == "Savings" || registration.getAccountType()
 * == "Fixed Deposit" || registration.getAccountType() == "Reoccuring")
 */