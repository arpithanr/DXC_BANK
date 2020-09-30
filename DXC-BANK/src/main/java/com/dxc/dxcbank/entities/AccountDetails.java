package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long accountNumber;
    private String accountHolderName;
    private String bankIFSC;

    /**
     * @return the accountNumber
     */
    public long getAccountNumber() {
	return accountNumber;
    }

    /**
     * @return the accountHolderName
     */
    public String getAccountHolderName() {
	return accountHolderName;
    }

    /**
     * @return the bankIFSC
     */
    public String getBankIFSC() {
	return bankIFSC;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
    }

    /**
     * @param accountHolderName the accountHolderName to set
     */
    public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
    }

    /**
     * @param bankIFSC the bankIFSC to set
     */
    public void setBankIFSC(String bankIFSC) {
	this.bankIFSC = bankIFSC;
    }

    @Override
    public String toString() {
	return "AccountDetails [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
		+ ", bankIFSC=" + bankIFSC + "]";
    }

}
