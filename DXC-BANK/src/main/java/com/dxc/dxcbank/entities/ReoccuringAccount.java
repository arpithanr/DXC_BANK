package com.dxc.dxcbank.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReoccuringAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountNumber;
    private String depositAmount;
    private String period;
    private String rateOfInterest;

    /**
     * @return the depositAmount
     */
    public String getDepositAmount() {
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
    public String getRateOfInterest() {
	return rateOfInterest;
    }

    /**
     * @param depositAmount the depositAmount to set
     */
    public void setDepositAmount(String depositAmount) {
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
    public void setRateOfInterest(String rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
    }

    @Override
    public String toString() {
	return "ReoccuringAccount [accountNumber=" + accountNumber + ", depositAmount=" + depositAmount + ", period="
		+ period + ", rateOfInterest=" + rateOfInterest + "]";
    }

}
