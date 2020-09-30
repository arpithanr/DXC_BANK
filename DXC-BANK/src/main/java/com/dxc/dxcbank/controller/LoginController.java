package com.dxc.dxcbank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dxcbank.entities.CustomerLogin;
import com.dxc.dxcbank.service.ILoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/customerLogin")
public class LoginController {
    
    @Autowired
    private ILoginService loginService;
    
    @PostMapping(path = "/saveDetails", consumes = { "application/json" })
    public CustomerLogin addCustomerLoginDetails(@RequestBody CustomerLogin customerLogin) {
	return loginService.addCustomerLoginDetails(customerLogin); 
    }
    
    @GetMapping(path = "/getLoginByUsername/{username}", produces = { "application/json" })
    public Optional<CustomerLogin> getLoginDetailsByUsername(@PathVariable("username") String username) {
	return loginService.getLoginDetailsByUsername(username); 
    }

}
