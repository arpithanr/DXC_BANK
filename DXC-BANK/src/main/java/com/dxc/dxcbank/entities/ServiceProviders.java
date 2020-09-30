package com.dxc.dxcbank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceProviders implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceProviderID;
    private String serviceProviderName;
    private String serviceType;

    /**
     * @return the serviceProviderID
     */
    public int getServiceProviderID() {
	return serviceProviderID;
    }

    /**
     * @return the serviceProviderName
     */
    public String getServiceProviderName() {
	return serviceProviderName;
    }

    /**
     * @return the serviceType
     */
    public String getServiceType() {
	return serviceType;
    }

    /**
     * @param serviceProviderID the serviceProviderID to set
     */
    public void setServiceProviderID(int serviceProviderID) {
	this.serviceProviderID = serviceProviderID;
    }

    /**
     * @param serviceProviderName the serviceProviderName to set
     */
    public void setServiceProviderName(String serviceProviderName) {
	this.serviceProviderName = serviceProviderName;
    }

    /**
     * @param serviceType the serviceType to set
     */
    public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
    }

}
