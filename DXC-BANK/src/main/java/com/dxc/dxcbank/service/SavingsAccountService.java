package com.dxc.dxcbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.SavingsAccount;
import com.dxc.dxcbank.exception.AccountDetailsInvalidException;
import com.dxc.dxcbank.repository.ISavingsAccountRepository;

@Service
public class SavingsAccountService implements ISavingsAccountService {

    @Autowired
    ISavingsAccountRepository savingsRepository;

    @Override
    public SavingsAccount addSavingsDetails(SavingsAccount savingsAccount) {
	SavingsAccount isValid = validateSavingsAccountDetails(savingsAccount);
	if(isValid != null) {
	    return savingsRepository.save(savingsAccount);
	} else {
	    throw new AccountDetailsInvalidException("Invalid Account Details..");
	}
    }

    @Override
    public List<SavingsAccount> getAllSavings() {
	return savingsRepository.findAll();
    }

    //Validating Account Details Here
    private SavingsAccount validateSavingsAccountDetails(SavingsAccount savingsAccount) {
	
	if (savingsAccount.getAccountBalance() >= 0 && 
		savingsAccount.getAccountHolderName() != null ) {
	    return savingsAccount;
	}
	return null;
    }

}
