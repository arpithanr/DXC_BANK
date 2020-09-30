package com.dxc.dxcbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.AccountDetails;
import com.dxc.dxcbank.repository.IAccountDetailsRepository;

@Service
public class AccountDetailsService implements IAccountDetailService {

    @Autowired 
    IAccountDetailsRepository accountRepository;    
    
    @Override
    public AccountDetails addDetails(AccountDetails accountDetails) {
	return accountRepository.save(accountDetails);
    }

    @Override
    public AccountDetails updateDetails(AccountDetails accountDetails) {
	return accountRepository.save(accountDetails);
    }

}
