package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminResponsibility implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int id;
    private String requestStatement;
    private String fundDeposit;
    private String serviceProvider;
    private boolean approval;

    /**
     * @return the id
     */
    public int getId() {
	return id;
    }

    /**
     * @return the requestStatement
     */
    public String getRequestStatement() {
	return requestStatement;
    }

    /**
     * @return the fundDeposit
     */
    public String getFundDeposit() {
	return fundDeposit;
    }

    /**
     * @return the serviceProvider
     */
    public String getServiceProvider() {
	return serviceProvider;
    }

    /**
     * @return the approval
     */
    public boolean isApproval() {
	return approval;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @param requestStatement the requestStatement to set
     */
    public void setRequestStatement(String requestStatement) {
	this.requestStatement = requestStatement;
    }

    /**
     * @param fundDeposit the fundDeposit to set
     */
    public void setFundDeposit(String fundDeposit) {
	this.fundDeposit = fundDeposit;
    }

    /**
     * @param serviceProvider the serviceProvider to set
     */
    public void setServiceProvider(String serviceProvider) {
	this.serviceProvider = serviceProvider;
    }

    /**
     * @param approval the approval to set
     */
    public void setApproval(boolean approval) {
	this.approval = approval;
    }

    @Override
    public String toString() {
	return "AdminResponsibility [id=" + id + ", requestStatement=" + requestStatement + ", fundDeposit="
		+ fundDeposit + ", serviceProvider=" + serviceProvider + ", approval=" + approval + "]";
    }

}
