package com.dxc.dxcbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dxcbank.entities.Transaction;
import com.dxc.dxcbank.exception.TransactionFailedException;
import com.dxc.dxcbank.repository.ITransactionRepository;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    ITransactionRepository iTransactionRepository;
    
    @Override
    public Transaction addTransaction(Transaction transaction) throws TransactionFailedException {
	Transaction isValid = validateTransaction(transaction);
	
	if (isValid != null) {
	    return iTransactionRepository.save(transaction);
	} else {
	    throw new TransactionFailedException("Transaction Failed. Insufficient Fund..");
	}
    }

    private Transaction validateTransaction(Transaction transaction) {
	
	if (transaction.getAmount() > 0) {
	    return transaction;
	}
	return null;
    }

}
