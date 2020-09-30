package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KYCDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private String customerName;
    @Id
    private long aadhaarNumber;
    private String cardPANNumber;
    private long contactNumber;

    public KYCDetails() {
	super();
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
	return customerName;
    }

    /**
     * @return the aadhaarNumber
     */
    public long getAadhaarNumber() {
	return aadhaarNumber;
    }

    /**
     * @return the cardPANNumber
     */
    public String getCardPANNumber() {
	return cardPANNumber;
    }

    /**
     * @return the contactNumber
     */
    public long getContactNumber() {
	return contactNumber;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
	this.customerName = customerName;
    }

    /**
     * @param aadhaarNumber the aadhaarNumber to set
     */
    public void setAadhaarNumber(long aadhaarNumber) {
	this.aadhaarNumber = aadhaarNumber;
    }

    /**
     * @param cardPANNumber the cardPANNumber to set
     */
    public void setCardPANNumber(String cardPANNumber) {
	this.cardPANNumber = cardPANNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
    }

}
