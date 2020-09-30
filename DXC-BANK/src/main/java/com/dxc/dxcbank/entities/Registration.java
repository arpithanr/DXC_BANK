package com.dxc.dxcbank.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String addressLine1;

    @Column(nullable = true)
    private String addressLine2;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String nation;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(unique = true, nullable = false)
    private long contactNumber;

    @Column(nullable = false)
    private String occupation;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)
    private String password;

    public Registration() {
	super();
    }

    /**
     * @return the customerId
     */
    public long getCustomerId() {
	return customerId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
	return firstName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
	return middleName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
	return lastName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
	return gender;
    }

    /**
     * @return the addressLine1
     */
    public String getAddressLine1() {
	return addressLine1;
    }

    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
	return addressLine2;
    }

    /**
     * @return the state
     */
    public String getState() {
	return state;
    }

    /**
     * @return the city
     */
    public String getCity() {
	return city;
    }

    /**
     * @return the nation
     */
    public String getNation() {
	return nation;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
	return dateOfBirth;
    }

    /**
     * @return the email
     */
    public String getEmail() {
	return email;
    }

    /**
     * @return the contactNumber
     */
    public long getContactNumber() {
	return contactNumber;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
	return occupation;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
	return accountType;
    }

    /**
     * @return the password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(long customerId) {
	this.customerId = customerId;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
	this.middleName = middleName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
	this.gender = gender;
    }

    /**
     * @param addressLine1 the addressLine1 to set
     */
    public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
    }

    /**
     * @param addressLine2 the addressLine2 to set
     */
    public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
	this.state = state;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
	this.city = city;
    }

    /**
     * @param nation the nation to set
     */
    public void setNation(String nation) {
	this.nation = nation;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
	this.email = email;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
	this.occupation = occupation;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
	this.accountType = accountType;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
	this.password = password;
    }

}
