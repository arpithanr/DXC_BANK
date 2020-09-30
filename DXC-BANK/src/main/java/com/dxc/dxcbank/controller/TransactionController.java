package com.dxc.dxcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dxcbank.entities.AccountDetails;
import com.dxc.dxcbank.entities.Transaction;
import com.dxc.dxcbank.entities.WifiBillPayment;
import com.dxc.dxcbank.exception.TransactionFailedException;
import com.dxc.dxcbank.service.IBenificiaryService;
import com.dxc.dxcbank.service.ITransactionService;
import com.dxc.dxcbank.service.IWifiBillService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;

    @Autowired
    IBenificiaryService benificiaryService;

    @Autowired
    IWifiBillService wifiBillService;

    @PostMapping(path = "/transactions", consumes = { "application/json" })
    public Transaction addTransaction(@RequestBody Transaction transaction) throws TransactionFailedException {
	return transactionService.addTransaction(transaction);
    }

    @PostMapping(path = "/addBenificiaryAccount", consumes = { "application/json" })
    public AccountDetails addBenificiaryDetails(@RequestBody AccountDetails account) {
	return benificiaryService.addBenificiaryDetails(account);
    }

    @PutMapping(path = "/updateBenificiaryAccount", consumes = { "application/json" })
    public AccountDetails updateBenificiaryDetails(@RequestBody AccountDetails account) {
	return benificiaryService.updateBenificiaryDetails(account);
    }

    @PostMapping(path = "/addwifibill", consumes = { "application/json" })
    public WifiBillPayment addBill(@RequestBody WifiBillPayment wifiBill) {
	return wifiBillService.addBill(wifiBill);
    }

}
