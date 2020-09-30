package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RemittanceManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long remittanceId;
    private String remittanceName;
    private String email;
    private String cardName;
    private long cardNumber;
    private String expireDate;
    private int cvv;

    /**
     * @return the remittanceId
     */
    public long getRemittanceId() {
	return remittanceId;
    }

    /**
     * @return the remittanceName
     */
    public String getRemittanceName() {
	return remittanceName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
	return email;
    }

    /**
     * @return the cardName
     */
    public String getCardName() {
	return cardName;
    }

    /**
     * @return the cardNumber
     */
    public long getCardNumber() {
	return cardNumber;
    }

    /**
     * @return the expireDate
     */
    public String getExpireDate() {
	return expireDate;
    }

    /**
     * @return the cvv
     */
    public int getCvv() {
	return cvv;
    }

    /**
     * @param remittanceId the remittanceId to set
     */
    public void setRemittanceId(long remittanceId) {
	this.remittanceId = remittanceId;
    }

    /**
     * @param remittanceName the remittanceName to set
     */
    public void setRemittanceName(String remittanceName) {
	this.remittanceName = remittanceName;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
	this.email = email;
    }

    /**
     * @param cardName the cardName to set
     */
    public void setCardName(String cardName) {
	this.cardName = cardName;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(long cardNumber) {
	this.cardNumber = cardNumber;
    }

    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(String expireDate) {
	this.expireDate = expireDate;
    }

    /**
     * @param cvv the cvv to set
     */
    public void setCvv(int cvv) {
	this.cvv = cvv;
    }

}
