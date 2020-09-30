package com.dxc.dxcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dxcbank.entities.FixedDepositAccount;
import com.dxc.dxcbank.service.IFixedDepositService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/fixedDeposit")
public class FixedDepositController {

    @Autowired
    private IFixedDepositService fixedDepositService;

    @PostMapping(path = "/deposit", consumes = { "application/json" })
    public FixedDepositAccount depositAmount(@RequestBody FixedDepositAccount fixedDeposit) {
	return fixedDepositService.depositAmount(fixedDeposit);
    }

    @PostMapping(path = "/withdraw", consumes = { "application/json" })
    public FixedDepositAccount witdrawAmount(@RequestBody FixedDepositAccount fixedDeposit) {
	return fixedDepositService.witdrawAmount(fixedDeposit);
    }

}
