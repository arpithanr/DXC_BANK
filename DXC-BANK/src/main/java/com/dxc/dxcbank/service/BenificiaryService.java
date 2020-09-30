package com.dxc.dxcbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.AccountDetails;
import com.dxc.dxcbank.repository.IBenificiaryDetailsRepository;

@Service
public class BenificiaryService implements IBenificiaryService {

    @Autowired
    IBenificiaryDetailsRepository benificiaryRepository;

    @Override
    public AccountDetails addBenificiaryDetails(AccountDetails accountDetails) {
	return benificiaryRepository.save(accountDetails);
    }

    @Override
    public AccountDetails updateBenificiaryDetails(AccountDetails accountDetails) {
	return benificiaryRepository.save(accountDetails);
    }

}
