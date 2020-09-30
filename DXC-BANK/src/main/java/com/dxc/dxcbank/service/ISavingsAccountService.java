package com.dxc.dxcbank.service;

import java.util.List;

import com.dxc.dxcbank.entities.SavingsAccount;

public interface ISavingsAccountService {


	SavingsAccount addSavingsDetails(SavingsAccount savingsAccount);

	List<SavingsAccount> getAllSavings();


}
