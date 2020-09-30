package com.dxc.dxcbank.service;

import com.dxc.dxcbank.entities.Transaction;
import com.dxc.dxcbank.exception.TransactionFailedException;

public interface ITransactionService {
    
    Transaction addTransaction(Transaction transaction) throws TransactionFailedException;
}
