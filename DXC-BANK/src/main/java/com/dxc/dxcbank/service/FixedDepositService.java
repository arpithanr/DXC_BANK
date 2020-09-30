package com.dxc.dxcbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.FixedDepositAccount;
import com.dxc.dxcbank.repository.IFixedAccountRepository;

@Service
public class FixedDepositService implements IFixedDepositService {

    @Autowired
    IFixedAccountRepository fixedRepository;

    @Override
    public FixedDepositAccount depositAmount(FixedDepositAccount fixedDeposit) {
	return fixedRepository.save(fixedDeposit);  
    }

    @Override
    public FixedDepositAccount witdrawAmount(FixedDepositAccount fixedDeposit) {
	return fixedRepository.save(fixedDeposit);
    }

}
