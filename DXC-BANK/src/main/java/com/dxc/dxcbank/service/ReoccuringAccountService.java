package com.dxc.dxcbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.ReoccuringAccount;
import com.dxc.dxcbank.repository.IReoccuringAccountRepository;

@Service
public class ReoccuringAccountService implements IReoccuringAccountService {

    @Autowired
    IReoccuringAccountRepository reoccuringRepository;
    
    @Override
    public ReoccuringAccount addAmount(ReoccuringAccount reoccuringAccount) {
	return reoccuringRepository.save(reoccuringAccount);
    }

}
