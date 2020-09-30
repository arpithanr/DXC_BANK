package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FixedDepositAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountNumber;
    private String accountHolderName;
    private double depositAmount;
    private String period;
    private double rateOfInterest;

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
     * @return the depositAmount
     */
    public double getDepositAmount() {
	return depositAmount;
    }

    /**
     * @return the period
     */
    public String getPeriod() {
	return period;
    }

    /**
     * @return the rateOfInterest
     */
    public double getRateOfInterest() {
	return rateOfInterest;
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
     * @param depositAmount the depositAmount to set
     */
    public void setDepositAmount(double depositAmount) {
	this.depositAmount = depositAmount;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(String period) {
	this.period = period;
    }

    /**
     * @param rateOfInterest the rateOfInterest to set
     */
    public void setRateOfInterest(double rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
    }

}
