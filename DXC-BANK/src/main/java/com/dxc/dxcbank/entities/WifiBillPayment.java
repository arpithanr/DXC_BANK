package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WifiBillPayment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long billId;
    private String amount;

    /**
     * @return the billId
     */
    public Long getBillId() {
	return billId;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
	return amount;
    }

    /**
     * @param billId the billId to set
     */
    public void setBillId(Long billId) {
	this.billId = billId;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
	this.amount = amount;
    }

    @Override
    public String toString() {
	return "WifiBillPayment [billId=" + billId + ", amount=" + amount + "]";
    }

}
