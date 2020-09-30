package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavingsAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountNumber;
    private double accountBalance;
    private String accountHolderName;

    /**
     * @return the accountNumber
     */
    public long getAccountNumber() {
	return accountNumber;
    }

    /**
     * @return the accountBalance
     */
    public double getAccountBalance() {
	return accountBalance;
    }

    /**
     * @return the accountHolderName
     */
    public String getAccountHolderName() {
	return accountHolderName;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
    }

    /**
     * @param accountBalance the accountBalance to set
     */
    public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
    }

    /**
     * @param accountHolderName the accountHolderName to set
     */
    public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
    }

}
