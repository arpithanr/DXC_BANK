package com.dxc.dxcbank.service;

import com.dxc.dxcbank.entities.Registration;
import com.dxc.dxcbank.exception.RegistrationException;

public interface IRegistrationService {

    Registration customerRegistration(Registration registration) throws RegistrationException; 
    
}
