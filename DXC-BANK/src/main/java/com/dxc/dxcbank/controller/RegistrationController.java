package com.dxc.dxcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dxcbank.entities.Registration;
import com.dxc.dxcbank.exception.RegistrationException;
import com.dxc.dxcbank.service.IRegistrationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/register")
public class RegistrationController {

    @Autowired
    private IRegistrationService registrationService;

    @PostMapping(path = "/", consumes = { "application/json" })
    public Registration customerRegistration(@RequestBody Registration registration) throws RegistrationException {
	return registrationService.customerRegistration(registration);
    }

}
