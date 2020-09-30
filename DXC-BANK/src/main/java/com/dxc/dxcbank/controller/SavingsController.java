package com.dxc.dxcbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dxcbank.entities.SavingsAccount;
import com.dxc.dxcbank.service.ISavingsAccountService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/savings")
public class SavingsController {

    @Autowired
    private ISavingsAccountService savingsAccountService;
    
    @PostMapping(path="/addSavingsDetails", consumes= {"application/json"})
    public SavingsAccount addSavingsDetails(@RequestBody SavingsAccount savingsAccount) {
    	return savingsAccountService.addSavingsDetails(savingsAccount);
    }

    @GetMapping(path = "/getAllSavings", produces = { "application/json" })
    public List<SavingsAccount> getAllSavings() {
	return savingsAccountService.getAllSavings();
    }

}
